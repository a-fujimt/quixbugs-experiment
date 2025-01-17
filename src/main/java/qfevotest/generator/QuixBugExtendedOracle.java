package qfevotest.generator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import qfevotest.generator.multithread.EVRunner;
import qfevotest.testrunner.LaucherJUnitProcess;
import qfevotest.testrunner.SummaryResults;
import qfevotest.testrunner.TestResult;

/**
 * Class that a) invokes the generation of evosuite test cases, and b) execute
 * programs over generated test cases.
 * 
 * @author Matias Martinez
 *
 */
public class QuixBugExtendedOracle {

	static int[] seeds = new int[30];

	static {
		// by default, seeds from 0 to 20-1
		for (int i = 0; i < 30; i++) {
			seeds[i] = i + 1;
		}
	}
	public static String[] subjectsQuixBugs = new String[] { "bitcount","depth_first_search","detect_cycle", "bucketsort", "find_first_in_sorted",
			"find_in_sorted", "flatten", "gcd", "get_factors", "hanoi", "is_valid_parenthesization", "kheapsort",
			"knapsack", "kth", "lcs_length", "levenshtein", "lis", "longest_common_subsequence", "max_sublist_sum",
			"mergesort", "next_palindrome", "next_permutation", "pascal", "possible_change", "powerset", "quicksort",
			"rpn_eval", "shunting_yard", "sieve", "sqrt", "subsequences", "to_base", "wrap", };	

	public void generateTest4AllPrograms(String out, int seed) throws Exception {

		for (String prog : subjectsQuixBugs) {
			generateAndRunEvoTests(out, prog, seed);
		}

	}

	/**
	 * 
	 * @param patchesDir
	 *            path to dir where the patches bytecode are located
	 * @param testLocation
	 *            patchesDir path to dir where the tests bytecode are located
	 * @param programToRepair
	 *            name of the program to repair
	 * @return
	 * @throws IOException
	 */
	public SummaryResults runEvosuiteAllSeedOnPatch(Path patchesDir, Path testLocation, String programToRepair, Integer seedNumber,String reportName,String patchContent)
			throws IOException {

		SummaryResults summaryResult = new SummaryResults(patchesDir.toString(), programToRepair, patchContent);
		summaryResult.setReportName(reportName);
		EvoTestGenerator generator = new EvoTestGenerator();
		File patchedVersionFolder = patchesDir.toFile();
		int[] targetSeeds = null;
		if(seedNumber>30) {
			System.out.println("seed number cannot more than 30");
			return null;
		} else if (seedNumber == 30){
			//run all seed
			targetSeeds = seeds;
		} else {
			//specific seed
			targetSeeds = new int[1];
			targetSeeds[0]=seedNumber;
		}
		for (int seed : targetSeeds) {
			System.out.println("Running " + programToRepair + " seed " + seed);

			File testFolderSeed = new File(
					testLocation + File.separator + "seed_" + seed + File.separator + "evosuite-tests");
			if (testFolderSeed.exists()) {
				LaucherJUnitProcess la = new LaucherJUnitProcess();
				generator.compileProgram(patchedVersionFolder.getAbsolutePath(), programToRepair);
				TestResult testResult = la.execute(
						patchedVersionFolder.getAbsolutePath() + File.pathSeparator + testFolderSeed.getAbsolutePath()
								+ File.pathSeparator + System.getProperty("java.class.path"),
						"java_programs." + programToRepair.toUpperCase() + "_ESTest", testFolderSeed.getAbsolutePath());

				if(null!=testResult) {
					summaryResult.addResultForSeed(testResult);
				}
				System.out.println("Results for " + programToRepair + " seed " + seed + ": " + testResult);

			} else {
				System.out.println("Any folder at " + testFolderSeed.getAbsolutePath());
			}

		}
		outputResult(summaryResult);
		return summaryResult;
	}
	
	
	
	
	public SummaryResults runSimpleTestsOnPatch(Path patchesDir, Path testLocation, String programToRepair, Integer seedNumber,String reportName,String patchContent)
			throws IOException {

		SummaryResults summaryResult = new SummaryResults(patchesDir.toString(), programToRepair, patchContent);
		summaryResult.setReportName(reportName);
		EvoTestGenerator generator = new EvoTestGenerator();
		File patchedVersionFolder = patchesDir.toFile();


			File testFolder = new File(testLocation+"");
			if (testFolder.exists()) {
				LaucherJUnitProcess la = new LaucherJUnitProcess();
				generator.compileProgram(patchedVersionFolder.getAbsolutePath(), programToRepair);
								
				String path = patchedVersionFolder.getAbsolutePath() + File.pathSeparator + testFolder.getAbsolutePath()
				+ File.pathSeparator + System.getProperty("java.class.path");
				
				TestResult testResult = la.execute(
						path,
						"java_programs." +programToRepair.toUpperCase() + "_TEST", testFolder.getAbsolutePath());
			if(null!=testResult) {
				summaryResult.addResultForSeed(testResult);
			}

			} else {
				System.out.println("Any folder at " + testFolder.getAbsolutePath());
			}


		outputResult(summaryResult);
		return summaryResult;
	}
	
	
	
	

	private void outputResult(SummaryResults summaryResult) {

		FileWriter fw = null;
		try {
			fw = new FileWriter(summaryResult.getReportName(), true);
			writePatchInfo(fw, summaryResult);
		} catch (Exception e) {
			System.out.println("An error in generating a evosuit running result report.");
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					System.out.println("failed to close file writer stream");
				}
			}

		}

	}

	public void outputResult(Collection<SummaryResults> summaryResults) {

		FileWriter fw = null;
		try {
			String path = "report.txt";
			fw = new FileWriter(path, false);
			System.out.println("Saving results on file " + new File(path).getAbsolutePath());
			for (SummaryResults summaryResult : summaryResults) {

				writePatchInfo(fw, summaryResult);
			}
		} catch (Exception e) {
			System.out.println("An error in generating a evosuit running result report.");
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					System.out.println("failed to close file writer stream");
				}
			}

		}

	}

	private void writePatchInfo(FileWriter fw, SummaryResults summaryResult) throws IOException {
		fw.write(System.getProperty("line.separator"));

		fw.write(new Date().toString() + " - Analyzing patched program: " + summaryResult.getProgramName()
				+ " under path " + summaryResult.getPatchPath());
		fw.write(System.getProperty("line.separator"));
		if (summaryResult.getPatchDiff() != null) {
			fw.write("Patch:");
			fw.write(System.getProperty("line.separator"));
			fw.write(summaryResult.getPatchDiff());
			fw.write(System.getProperty("line.separator"));
		}
		if(null==summaryResult.isCorrect()) {
			fw.write("Errors in running tests ");
		} else if (summaryResult.isCorrect()) {
			fw.write("passed all tests ");
		} else {
			fw.write("failed tests number: " + summaryResult.getFailingNumber());
			fw.write(System.getProperty("line.separator"));
			fw.write("failed tests info: " + summaryResult.getFailingInfo());
		}
		fw.flush();
	}

	public void generateTest4AllProgramsAllSeed(String outDir) throws Exception {

		for (String programToRepair : subjectsQuixBugs) {

			generateTestsAllForProgram(outDir, programToRepair);

		}

	}

	private void generateTestsAllForProgram(String outDir, String prog) throws Exception, IOException {
		for (int seed : seeds) {
			System.out.println("****Seed " + seed + " of program " + prog);
			generateAndRunEvoTests(outDir, prog, seed);
		}
	}

	public boolean generateAndRunEvoTests(String outDir, String prog, int seed) throws Exception, IOException {
		EvoTestGenerator ev = new EvoTestGenerator();
		System.out.println("Running " + prog + " seed " + seed);
		boolean useDSE = false;
		int timeout = 60;

		boolean generated = ev.runEvosuite("java_programs" + "." + prog.toUpperCase(), new File(".").getAbsolutePath(),
				outDir, seed, timeout, useDSE);

		File fESout = new File(outDir + File.separator + "seed_" + seed + File.separator + "evosuite-tests");

		ev.compileEvoSuiteTest(fESout.getAbsolutePath(), prog);

		LaucherJUnitProcess la = new LaucherJUnitProcess();

		TestResult testsResults = la.execute(
				fESout.getAbsolutePath() + File.pathSeparator + System.getProperty("java.class.path"),
				"java_programs." + prog.toUpperCase() + "_ESTest", fESout.getAbsolutePath());
		System.out.println("Results for " + prog + " seed " + seed + ": " + testsResults);
		return testsResults.areAllTestsPassing();
	}

	public boolean checkDeterministic(String testLocation, String programToRepair) throws Exception, IOException {
		int times = 10;
		boolean sameresults = true;

		for (int seed : seeds) {
			System.out.println("Running " + programToRepair + " seed " + seed);

			File fESout = new File(testLocation + File.separator + "seed_" + seed + File.separator + "evosuite-tests");
			if (fESout.exists()) {
				LaucherJUnitProcess la = new LaucherJUnitProcess();
				TestResult lastResult = null;
				// boolean sameresults = true;
				for (int i = 0; i < times; i++) {
					TestResult tr = la.execute(
							fESout.getAbsolutePath() + File.pathSeparator + System.getProperty("java.class.path"),
							"java_programs." + programToRepair.toUpperCase() + "_ESTest", fESout.getAbsolutePath());
					System.out
							.println("Results for " + programToRepair + " seed " + seed + " at time " + i + ": " + tr);
					if (lastResult != null) {
						sameresults &= (lastResult.equals(tr));
					}
					lastResult = tr;
				}
				System.out.println("check deterministic  " + programToRepair + " seed " + seed + ": " + sameresults);
				if (!sameresults) {
					System.out
							.println("Error not deterministic tests for program " + programToRepair + " seed " + seed);
					return false;
				}
			} else {
				System.out.println("Alert:  Seed not exist " + seed);
			}
		}
		return sameresults;
	}

	public boolean checkOriginalCorrect(String testLocation, String programToRepair) throws Exception, IOException {

		for (int seed : seeds) {
			System.out.println("Running " + programToRepair + " seed " + seed);

			File fESout = new File(testLocation + File.separator + "seed_" + seed + File.separator + "evosuite-tests");
			if (fESout.exists()) {
				LaucherJUnitProcess la = new LaucherJUnitProcess();

				TestResult tr = la.execute(
						fESout.getAbsolutePath() + File.pathSeparator + System.getProperty("java.class.path"),
						"java_programs." + programToRepair.toUpperCase() + "_ESTest", fESout.getAbsolutePath());
				System.out.println("Results for " + programToRepair + " seed " + seed + ": " + tr);

				if (tr != null && (!tr.areAllTestsPassing() || tr.getCasesExecuted() == 0)) {
					System.out.println("Failing " + programToRepair + " seed " + seed + ": " + tr);

					return false;
				}
			} else {
				System.out.println("Alert:  Seed not exist " + seed);
			}
		}
		return true;
	}

	public void generateTestAllSeedMultithread(String outDir, int numThreads) throws Exception {

		ExecutorService exec = Executors.newFixedThreadPool(numThreads);

		for (String programToRepair : subjectsQuixBugs) {

			for (int seed : seeds) {
				System.out.println("****Registering Seed " + seed + " of program " + programToRepair);
				// runGeneration(out, prog, seed);
				EVRunner evrunner = new EVRunner(outDir, seed, programToRepair);
				exec.execute(evrunner);

			}

		}
		exec.shutdown();
		try {
			if (!exec.awaitTermination(10, TimeUnit.HOURS)) {
				exec.shutdownNow();
			}
		} catch (InterruptedException e) {
			exec.shutdownNow();
		}
	}

	public Map<String, SummaryResults> runAllResults(File generatedTest, int seedNumber, String reportName) throws IOException {
		Map<String, SummaryResults> resultByProgram = new HashMap<>();
		for (String programToRepair : subjectsQuixBugs) {
			// Here, we pass the location to the patched version bytecode
			// "./patchedPrograms/lis/statement/p1/"
			System.out.println("Program " + programToRepair);
			File patchesLocationRoot = new File("./patchedPrograms");
			File folderProgram = new File(patchesLocationRoot, programToRepair);
			if (!folderProgram.isDirectory())
				continue;
			for (File method : folderProgram.listFiles()) {
				System.out.println("--> method " + method.getName());
				if (method.isDirectory()) {
					for (File patch : method.listFiles()) {
						if (patch.isDirectory()) {
							System.out.println("--> patch " + patch.getName());
							// patch_get_factors_cardumen.diff
							String patchContent = new String(Files.readAllBytes(
									Paths.get(method.getAbsolutePath() + File.separator + "patch_" + programToRepair
											+ "_" + method.getName() + "_" + patch.getName().substring(1) + ".diff")));
							System.out.println("Diff: \n" + patchContent);

							QuixBugExtendedOracle qg = new QuixBugExtendedOracle();

							System.out.println("Analyzing patch at " + patch.getAbsolutePath());
							SummaryResults resultallseeds = null;
							if(seedNumber!=0) {
								//tests generated by EvoSuite
								resultallseeds = qg.runEvosuiteAllSeedOnPatch(patch.toPath(),
									generatedTest.toPath(), programToRepair.toUpperCase(), seedNumber,reportName,patchContent);
							} else {
								//simple tests generated by us
								resultallseeds = qg.runSimpleTestsOnPatch(patch.toPath(),
										generatedTest.toPath(), programToRepair.toUpperCase(), seedNumber,reportName,patchContent);
							}
							
							
							
							
							resultByProgram.put(patch.toPath().toString(), resultallseeds);
							System.out.println("Result for " + programToRepair + " " + resultallseeds.isCorrect());
						}
					}
				}
			}
		}
		return resultByProgram;
	}

}

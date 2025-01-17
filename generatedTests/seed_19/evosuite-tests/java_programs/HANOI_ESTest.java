/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 05 21:33:57 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java_programs.HANOI;
import org.evosuite.runtime.ViolatedAssumptionAnswer;

public class HANOI_ESTest {

  @Test(timeout = 8000)
  public void test0()  throws Throwable  {
      HANOI hANOI0 = new HANOI();
      HANOI.Pair<Object, Object> hANOI_Pair0 = (HANOI.Pair<Object, Object>) mock(HANOI.Pair.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(hANOI_Pair0).toString();
      HANOI.Pair<HANOI.Pair<Object, Object>, Object> hANOI_Pair1 = new HANOI.Pair<HANOI.Pair<Object, Object>, Object>(hANOI_Pair0, "_~+~");
      HANOI.Pair<Object, Object> hANOI_Pair2 = new HANOI.Pair<Object, Object>(hANOI_Pair1, "_~+~");
      hANOI_Pair2.setSecond(hANOI0);
      hANOI_Pair2.setFirst(hANOI0);
      hANOI_Pair1.toString();
      HANOI.Pair<Object, Object> hANOI_Pair3 = new HANOI.Pair<Object, Object>(hANOI_Pair2, "_~+~");
      hANOI_Pair1.setFirst(hANOI_Pair3);
      HANOI.Pair<String, String> hANOI_Pair4 = (HANOI.Pair<String, String>) mock(HANOI.Pair.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(hANOI_Pair4).toString();
      HANOI.Pair<HANOI.Pair<String, String>, HANOI.Pair<String, String>> hANOI_Pair5 = new HANOI.Pair<HANOI.Pair<String, String>, HANOI.Pair<String, String>>(hANOI_Pair4, hANOI_Pair4);
      HANOI.Pair<String, String> hANOI_Pair6 = new HANOI.Pair<String, String>("", "");
      hANOI_Pair5.setFirst(hANOI_Pair6);
      Integer integer0 = new Integer(897);
      HANOI.Pair<Object, Integer> hANOI_Pair7 = new HANOI.Pair<Object, Integer>("_~+~", integer0);
      hANOI_Pair7.setFirst(hANOI_Pair5);
      hANOI_Pair7.toString();
      Object object0 = new Object();
      HANOI.Pair<Integer, Object> hANOI_Pair8 = new HANOI.Pair<Integer, Object>(integer0, object0);
      hANOI_Pair8.getFirst();
      Object object1 = new Object();
      HANOI.Pair<String, Object> hANOI_Pair9 = new HANOI.Pair<String, Object>("", object1);
      hANOI_Pair9.toString();
      hANOI_Pair9.getSecond();
      HANOI.Pair<Integer, Integer> hANOI_Pair10 = new HANOI.Pair<Integer, Integer>((Integer) null, integer0);
      Integer integer1 = hANOI_Pair10.getSecond();
      assertEquals(897, (int)integer1);
  }

//  @Test(timeout = 8000)
//  public void test1()  throws Throwable  {
//      HANOI.Pair<String, String> hANOI_Pair0 = new HANOI.Pair<String, String>(")", ")");
//      hANOI_Pair0.toString();
//      hANOI_Pair0.toString();
//      hANOI_Pair0.setSecond(")");
//      hANOI_Pair0.setFirst(")");
//      HANOI hANOI0 = new HANOI();
//      int int0 = (-1465);
//      int int1 = 1026;
//      HANOI.hanoi(0, (-1465), 1026);
//      HANOI.hanoi(int1, int1, int0);
//      Integer integer0 = new Integer(int1);
//      int int2 = 2;
//      Integer integer1 = new Integer(int2);
//      HANOI.Pair<Integer, Integer> hANOI_Pair1 = new HANOI.Pair<Integer, Integer>(integer0, integer1);
//      Integer integer2 = new Integer(int0);
//      hANOI_Pair1.setFirst(integer2);
//      Integer integer3 = new Integer(int2);
//      String string0 = "m&\"u0E";
//      HANOI.Pair<Integer, String> hANOI_Pair2 = new HANOI.Pair<Integer, String>(integer3, string0);
//      hANOI_Pair2.toString();
//  }

//  @Test(timeout = 8000)
//  public void test2()  throws Throwable  {
//      HANOI.hanoi((-1618), (-1618), (-1618));
//      Integer integer0 = new Integer((-1618));
//      HANOI.Pair<Integer, Integer> hANOI_Pair0 = new HANOI.Pair<Integer, Integer>(integer0, integer0);
//      String string0 = hANOI_Pair0.toString();
//      Integer integer1 = new Integer((-1618));
//      hANOI_Pair0.setSecond(integer1);
//      Integer integer2 = new Integer(948);
//      int int0 = Integer.sum(1153, 1153);
//      HANOI.Pair<Object, Integer> hANOI_Pair1 = new HANOI.Pair<Object, Integer>("(-1618, -1618)", integer2);
//      hANOI_Pair1.setFirst(integer1);
//      HANOI hANOI0 = new HANOI();
//      int int1 = 4948;
//      int int2 = 1;
//      HANOI.hanoi(int1, int1, int2);
//      String string1 = "IK5ZP'+cKgm^";
//      HANOI.Pair<String, String> hANOI_Pair2 = new HANOI.Pair<String, String>(string1, string1);
//      Integer integer3 = null;
//      Integer integer4 = new Integer(int0);
//      hANOI_Pair0.setFirst(integer4);
//      String string2 = "";
//      hANOI_Pair2.setSecond(string2);
//      hANOI_Pair0.setSecond(integer3);
//      hANOI_Pair2.getSecond();
//      HANOI.Pair<String, Object> hANOI_Pair3 = new HANOI.Pair<String, Object>(string1, string0);
//      hANOI_Pair3.setFirst(string1);
//      hANOI_Pair3.toString();
//      hANOI_Pair3.toString();
//      hANOI_Pair0.setSecond(integer2);
//      String string3 = "";
//      int int3 = 245;
//      Integer integer5 = new Integer(int3);
//      HANOI.Pair<String, Integer> hANOI_Pair4 = new HANOI.Pair<String, Integer>(string3, integer5);
//      hANOI_Pair4.getFirst();
//      String string4 = "";
//      HANOI.Pair<String, HANOI.Pair<Object, Integer>> hANOI_Pair5 = new HANOI.Pair<String, HANOI.Pair<Object, Integer>>(string4, hANOI_Pair1);
//      String string5 = "java_programs.HANOI$Pair";
//      hANOI_Pair5.setFirst(string5);
//  }

  @Test(timeout = 8000)
  public void test3()  throws Throwable  {
      Integer integer0 = new Integer(0);
      HANOI.Pair<String, Integer> hANOI_Pair0 = new HANOI.Pair<String, Integer>("6`:nbKY", integer0);
      HANOI.hanoi(0, 0, 0);
  }

  @Test(timeout = 8000)
  public void test4()  throws Throwable  {
      HANOI hANOI0 = new HANOI();
      HANOI.Pair<Object, Object> hANOI_Pair0 = (HANOI.Pair<Object, Object>) mock(HANOI.Pair.class, new ViolatedAssumptionAnswer());
      HANOI.Pair<Object, HANOI.Pair<Object, Object>> hANOI_Pair1 = new HANOI.Pair<Object, HANOI.Pair<Object, Object>>(hANOI0, hANOI_Pair0);
      Object object0 = hANOI_Pair1.getFirst();
      Integer integer0 = new Integer(2913);
      HANOI.Pair<Integer, Object> hANOI_Pair2 = new HANOI.Pair<Integer, Object>(integer0, hANOI0);
      hANOI_Pair2.setSecond(object0);
      HANOI.Pair<String, Object> hANOI_Pair3 = (HANOI.Pair<String, Object>) mock(HANOI.Pair.class, new ViolatedAssumptionAnswer());
      HANOI.Pair<HANOI.Pair<String, Object>, Integer> hANOI_Pair4 = new HANOI.Pair<HANOI.Pair<String, Object>, Integer>(hANOI_Pair3, integer0);
      hANOI_Pair4.getSecond();
  }

  @Test(timeout = 8000)
  public void test5()  throws Throwable  {
      HANOI hANOI0 = new HANOI();
      HANOI.hanoi(1, (-1808), 1);
      Integer integer0 = new Integer((-2697));
      HANOI.Pair<Integer, String> hANOI_Pair0 = new HANOI.Pair<Integer, String>(integer0, "HVka?&");
      hANOI_Pair0.setFirst(integer0);
  }

  @Test(timeout = 8000)
  public void test6()  throws Throwable  {
      HANOI.Pair<String, Integer> hANOI_Pair0 = new HANOI.Pair<String, Integer>("9I", (Integer) null);
      hANOI_Pair0.toString();
      hANOI_Pair0.getSecond();
      Integer.min(1, 1);
      HANOI.Pair<Object, Integer> hANOI_Pair1 = new HANOI.Pair<Object, Integer>("(9I, null)", (Integer) null);
      hANOI_Pair1.setFirst((Object) null);
      hANOI_Pair1.setSecond((Integer) null);
      hANOI_Pair1.getSecond();
      HANOI hANOI0 = new HANOI();
      HANOI.Pair<Integer, Object> hANOI_Pair2 = new HANOI.Pair<Integer, Object>((Integer) null, "9I");
      hANOI_Pair2.setFirst((Integer) null);
  }

  @Test(timeout = 8000)
  public void test7()  throws Throwable  {
      Object object0 = new Object();
      HANOI.Pair<Object, String> hANOI_Pair0 = new HANOI.Pair<Object, String>(object0, "{B,'\"F Q3x\u0000{Lk");
      Object object1 = hANOI_Pair0.getFirst();
      HANOI.Pair<Object, Object> hANOI_Pair1 = new HANOI.Pair<Object, Object>(object0, object1);
  }
}

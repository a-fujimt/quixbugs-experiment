/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 08 18:50:21 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java_programs.KNAPSACK;

public class KNAPSACK_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[][] intArray0 = new int[1][1];
      int[] intArray1 = new int[6];
      intArray1[0] = (-2397);
      intArray1[1] = (-2397);
      intArray1[2] = (-2397);
      intArray1[4] = (-2397);
      intArray1[5] = 0;
      intArray0[0] = intArray1;
      // Undeclared exception!
      try { 
        KNAPSACK.knapsack((-2397), intArray0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      KNAPSACK kNAPSACK0 = new KNAPSACK();
      int[][] intArray0 = new int[6][1];
      int[] intArray1 = new int[4];
      intArray1[0] = 1339;
      intArray1[1] = 1339;
      intArray1[2] = 0;
      intArray1[3] = 1339;
      intArray0[0] = intArray1;
      int[] intArray2 = new int[4];
      intArray2[0] = 1;
      intArray2[1] = 1339;
      intArray2[2] = 2230;
      intArray2[3] = 0;
      intArray0[1] = intArray2;
      int[] intArray3 = new int[7];
      intArray3[0] = 1;
      intArray3[1] = 0;
      intArray3[2] = 1;
      intArray3[3] = 1;
      intArray3[4] = 2230;
      intArray3[5] = 1;
      intArray3[6] = 1;
      intArray0[2] = intArray3;
      int[] intArray4 = new int[8];
      intArray4[0] = 2230;
      intArray4[1] = 1;
      intArray4[2] = (-921);
      intArray4[3] = 1339;
      intArray4[4] = 1;
      intArray4[5] = 1;
      intArray4[6] = 0;
      intArray4[7] = 1;
      intArray0[3] = intArray4;
      int[] intArray5 = new int[5];
      intArray5[0] = 0;
      intArray5[1] = 1339;
      intArray5[2] = 1;
      intArray5[3] = 1339;
      intArray5[4] = 0;
      intArray0[4] = intArray5;
      int[] intArray6 = new int[4];
      intArray6[0] = 2230;
      intArray6[1] = 0;
      intArray6[2] = 1339;
      intArray6[3] = 0;
      intArray0[5] = intArray6;
      int int0 = KNAPSACK.knapsack(1339, intArray0);
      assertEquals(2678, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[][] intArray0 = new int[0][7];
      KNAPSACK.knapsack(3810, intArray0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      KNAPSACK kNAPSACK0 = new KNAPSACK();
      int[][] intArray0 = new int[1][7];
      int[] intArray1 = new int[1];
      intArray1[0] = (-3820);
      intArray0[0] = intArray1;
      // Undeclared exception!
      try { 
        KNAPSACK.knapsack(1028, intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        KNAPSACK.knapsack((-292), (int[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      int[][] intArray0 = new int[1][7];
      int[] intArray1 = new int[2];
      intArray1[0] = 2138;
      intArray1[1] = 2138;
      intArray0[0] = intArray1;
      KNAPSACK.knapsack(2138, intArray0);
      KNAPSACK kNAPSACK0 = new KNAPSACK();
      // Undeclared exception!
      KNAPSACK.knapsack(3348, intArray0);
  }
}
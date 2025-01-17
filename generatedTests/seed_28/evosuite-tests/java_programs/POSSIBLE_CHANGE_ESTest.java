/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 08 22:48:31 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java_programs.POSSIBLE_CHANGE;

public class POSSIBLE_CHANGE_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      POSSIBLE_CHANGE pOSSIBLE_CHANGE0 = new POSSIBLE_CHANGE();
      int[] intArray0 = null;
      int int0 = 2540;
      // Undeclared exception!
      try { 
        POSSIBLE_CHANGE.possible_change((int[]) null, 2540);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = null;
      int int0 = 0;
      POSSIBLE_CHANGE.possible_change((int[]) null, 0);
      int[] intArray1 = new int[2];
      intArray1[0] = 0;
      intArray1[1] = (-4273);
      int int1 = 1;
      POSSIBLE_CHANGE.possible_change(intArray1, int1);
      POSSIBLE_CHANGE pOSSIBLE_CHANGE0 = new POSSIBLE_CHANGE();
      POSSIBLE_CHANGE.possible_change(intArray0, int0);
      int int2 = 232;
      POSSIBLE_CHANGE.possible_change(intArray0, int2);
      int int3 = 1;
      POSSIBLE_CHANGE.possible_change(intArray1, int3);
      int int4 = 0;
      int int5 = POSSIBLE_CHANGE.possible_change(intArray0, int4);
      int int6 = POSSIBLE_CHANGE.possible_change(intArray0, int4);
      POSSIBLE_CHANGE.possible_change(intArray1, int6);
      POSSIBLE_CHANGE.possible_change(intArray1, intArray1[1]);
      int int7 = POSSIBLE_CHANGE.possible_change(intArray0, int5);
      int int8 = 2729;
      POSSIBLE_CHANGE.possible_change(intArray1, int8);
      int int9 = (-1);
      int int10 = POSSIBLE_CHANGE.possible_change(intArray0, int9);
      POSSIBLE_CHANGE.possible_change(intArray0, int7);
      POSSIBLE_CHANGE.possible_change(intArray0, int10);
      POSSIBLE_CHANGE.possible_change(intArray0, int1);
      int int11 = 0;
      POSSIBLE_CHANGE.possible_change(intArray0, int11);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      POSSIBLE_CHANGE pOSSIBLE_CHANGE0 = new POSSIBLE_CHANGE();
      int[] intArray0 = new int[1];
      intArray0[0] = 770;
      int int0 = POSSIBLE_CHANGE.possible_change(intArray0, 770);
      assertEquals(1, int0);
      
      POSSIBLE_CHANGE.possible_change(intArray0, 0);
      int[] intArray1 = new int[6];
      intArray1[0] = 0;
      intArray1[1] = 1;
      intArray1[2] = 1;
      intArray1[3] = 0;
      intArray1[4] = 770;
      intArray1[5] = 1;
      int int1 = POSSIBLE_CHANGE.possible_change(intArray1, 0);
      assertEquals(1, int1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      POSSIBLE_CHANGE pOSSIBLE_CHANGE0 = new POSSIBLE_CHANGE();
      int[] intArray0 = new int[8];
      intArray0[0] = 0;
      intArray0[1] = 0;
      intArray0[2] = 0;
      intArray0[3] = (-384);
      intArray0[4] = 0;
      intArray0[5] = 0;
      intArray0[6] = (-1);
      intArray0[7] = 0;
      POSSIBLE_CHANGE.possible_change(intArray0, (-2175));
      POSSIBLE_CHANGE.possible_change(intArray0, (-1));
      int[] intArray1 = new int[2];
      intArray1[0] = 0;
      intArray1[1] = 0;
      POSSIBLE_CHANGE.possible_change(intArray1, 0);
      int int0 = 1;
      POSSIBLE_CHANGE.possible_change(intArray0, int0);
      int int1 = 504;
      POSSIBLE_CHANGE.possible_change(intArray1, int1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      POSSIBLE_CHANGE pOSSIBLE_CHANGE0 = new POSSIBLE_CHANGE();
      int[] intArray0 = new int[8];
      intArray0[0] = 0;
      intArray0[1] = (-1);
      intArray0[2] = (-2111);
      intArray0[3] = 0;
      intArray0[4] = 0;
      intArray0[5] = 1;
      intArray0[6] = (-387);
      intArray0[7] = 0;
      int int0 = 541;
      POSSIBLE_CHANGE.possible_change(intArray0, int0);
  }
}

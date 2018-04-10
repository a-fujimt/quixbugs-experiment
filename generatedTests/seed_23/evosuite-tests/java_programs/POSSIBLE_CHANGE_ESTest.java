/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 08 22:34:40 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java_programs.POSSIBLE_CHANGE;

public class POSSIBLE_CHANGE_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      POSSIBLE_CHANGE pOSSIBLE_CHANGE0 = new POSSIBLE_CHANGE();
      int[] intArray0 = new int[4];
      int int0 = 1;
      intArray0[0] = 1;
      intArray0[1] = 0;
      intArray0[2] = (-1);
      int int1 = 0;
      intArray0[3] = 0;
      POSSIBLE_CHANGE.possible_change(intArray0, (-1));
      int[] intArray1 = new int[2];
      intArray1[0] = 1;
      intArray1[1] = 0;
      POSSIBLE_CHANGE.possible_change(intArray1, (-1));
      POSSIBLE_CHANGE.possible_change(intArray1, int0);
      int int2 = 1;
      POSSIBLE_CHANGE.possible_change(intArray1, int2);
      int int3 = 0;
      POSSIBLE_CHANGE.possible_change(intArray1, int3);
      int int4 = (-869);
      POSSIBLE_CHANGE.possible_change(intArray1, int4);
      POSSIBLE_CHANGE.possible_change(intArray1, int1);
      POSSIBLE_CHANGE.possible_change(intArray0, intArray0[2]);
      int int5 = 1;
      POSSIBLE_CHANGE.possible_change(intArray0, int5);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = null;
      POSSIBLE_CHANGE.possible_change((int[]) null, (-1));
      // Undeclared exception!
      try { 
        POSSIBLE_CHANGE.possible_change((int[]) null, 145);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = (-649);
      intArray0[1] = (-2252);
      POSSIBLE_CHANGE.possible_change(intArray0, (-649));
      POSSIBLE_CHANGE pOSSIBLE_CHANGE0 = new POSSIBLE_CHANGE();
      int int0 = POSSIBLE_CHANGE.possible_change(intArray0, 0);
      POSSIBLE_CHANGE.possible_change(intArray0, int0);
      int int1 = 0;
      POSSIBLE_CHANGE.possible_change(intArray0, int1);
      int[] intArray1 = new int[0];
      int int2 = 0;
      POSSIBLE_CHANGE.possible_change(intArray1, int2);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = (-1);
      intArray0[1] = 0;
      intArray0[2] = 436;
      int int0 = 344;
      intArray0[3] = 344;
      POSSIBLE_CHANGE.possible_change(intArray0, intArray0[3]);
      POSSIBLE_CHANGE pOSSIBLE_CHANGE0 = new POSSIBLE_CHANGE();
      POSSIBLE_CHANGE.possible_change(intArray0, int0);
      int int1 = 0;
      POSSIBLE_CHANGE.possible_change(intArray0, int1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      POSSIBLE_CHANGE pOSSIBLE_CHANGE0 = new POSSIBLE_CHANGE();
      int[] intArray0 = new int[7];
      intArray0[0] = 2595;
      intArray0[1] = (-1);
      intArray0[2] = 4642;
      intArray0[3] = 0;
      intArray0[4] = 0;
      intArray0[5] = 0;
      intArray0[6] = (-2047);
      int int0 = POSSIBLE_CHANGE.possible_change(intArray0, (-1117));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      int[] intArray0 = new int[0];
      POSSIBLE_CHANGE.possible_change(intArray0, 99);
      POSSIBLE_CHANGE pOSSIBLE_CHANGE0 = new POSSIBLE_CHANGE();
      POSSIBLE_CHANGE.possible_change(intArray0, 0);
      POSSIBLE_CHANGE.possible_change(intArray0, 3317);
      POSSIBLE_CHANGE.possible_change(intArray0, 3317);
      POSSIBLE_CHANGE.possible_change(intArray0, 0);
      int int0 = POSSIBLE_CHANGE.possible_change(intArray0, 2132);
      assertEquals(0, int0);
      
      POSSIBLE_CHANGE.possible_change(intArray0, 0);
      int int1 = POSSIBLE_CHANGE.possible_change(intArray0, 0);
      POSSIBLE_CHANGE.possible_change(intArray0, (-3941));
      int int2 = POSSIBLE_CHANGE.possible_change(intArray0, (-390));
      assertFalse(int2 == int1);
      
      int[] intArray1 = new int[7];
      intArray1[0] = 1;
      intArray1[1] = 99;
      intArray1[2] = 0;
      intArray1[3] = 0;
      intArray1[4] = 0;
      intArray1[5] = 0;
      intArray1[6] = 1294;
      int int3 = POSSIBLE_CHANGE.possible_change(intArray1, 0);
      assertEquals(1, int3);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      POSSIBLE_CHANGE pOSSIBLE_CHANGE0 = new POSSIBLE_CHANGE();
      int[] intArray0 = new int[8];
      intArray0[0] = (-1663);
      intArray0[1] = (-2915);
      intArray0[2] = 1840;
      intArray0[3] = (-1105);
      intArray0[4] = 0;
      intArray0[5] = (-1);
      intArray0[6] = (-3234);
      intArray0[7] = 47;
      int int0 = POSSIBLE_CHANGE.possible_change(intArray0, (-3146));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      int[] intArray0 = new int[5];
      intArray0[0] = 0;
      intArray0[1] = (-3385);
      int int0 = 1;
      intArray0[2] = 1;
      intArray0[3] = 1;
      intArray0[4] = (-3425);
      POSSIBLE_CHANGE.possible_change(intArray0, (-1505));
      POSSIBLE_CHANGE pOSSIBLE_CHANGE0 = new POSSIBLE_CHANGE();
      int int1 = 44;
      int int2 = POSSIBLE_CHANGE.possible_change(intArray0, int1);
      int int3 = 1;
      POSSIBLE_CHANGE.possible_change(intArray0, int3);
      int[] intArray1 = new int[2];
      intArray1[0] = int2;
      intArray1[1] = int0;
      int int4 = 0;
      POSSIBLE_CHANGE.possible_change(intArray1, int4);
  }
}
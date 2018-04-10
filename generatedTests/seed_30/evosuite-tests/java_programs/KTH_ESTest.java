/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 08 19:17:00 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java_programs.KTH;

public class KTH_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      KTH kTH0 = new KTH();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer((-1));
      arrayList0.add(integer0);
      Integer integer1 = KTH.kth(arrayList0, 0);
      assertEquals((-1), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer(3240);
      Integer integer1 = new Integer(1);
      arrayList0.add(integer1);
      arrayList0.add(integer0);
      Integer integer2 = new Integer(2259);
      arrayList0.add(integer2);
      Integer integer3 = KTH.kth(arrayList0, 1);
      assertEquals(2259, (int)integer3);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        KTH.kth((ArrayList<Integer>) null, (-845));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer(8);
      arrayList0.add(integer0);
      Integer integer1 = KTH.kth(arrayList0, 0);
      assertEquals(8, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer(0);
      arrayList0.add(integer0);
      Integer integer1 = KTH.kth(arrayList0, 0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer((-2964));
      arrayList0.add(integer0);
      // Undeclared exception!
      try { 
        KTH.kth(arrayList0, 1038);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
      }
  }
}
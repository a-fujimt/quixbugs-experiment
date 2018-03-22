/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 06 04:12:11 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java_programs.SIEVE;

public class SIEVE_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SIEVE sIEVE0 = new SIEVE();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Integer integer0 = new Integer(0);
      ArrayList<Integer> arrayList0 = SIEVE.sieve(integer0);
      ArrayList<Boolean> arrayList1 = SIEVE.list_comp(0, arrayList0);
      arrayList1.add((Boolean) null);
      // Undeclared exception!
      try { 
        SIEVE.all(arrayList1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Integer integer0 = new Integer(159);
      ArrayList<Integer> arrayList0 = SIEVE.sieve(integer0);
      ArrayList<Boolean> arrayList1 = SIEVE.list_comp(159, arrayList0);
      boolean boolean0 = SIEVE.any(arrayList1);
      assertEquals(37, arrayList1.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      ArrayList<Boolean> arrayList1 = SIEVE.list_comp(0, arrayList0);
      Boolean boolean0 = new Boolean(false);
      arrayList1.add(boolean0);
      boolean boolean1 = SIEVE.any(arrayList1);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        SIEVE.any((ArrayList<Boolean>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer(0);
      arrayList0.add(integer0);
      // Undeclared exception!
      try { 
        SIEVE.list_comp(2306, arrayList0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        SIEVE.list_comp(0, (ArrayList<Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        SIEVE.sieve((Integer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Integer integer0 = new Integer(944);
      // Undeclared exception!
      SIEVE.sieve(integer0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      ArrayList<Boolean> arrayList1 = SIEVE.list_comp(0, arrayList0);
      Boolean boolean0 = new Boolean(false);
      arrayList1.add(boolean0);
      boolean boolean1 = SIEVE.all(arrayList1);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ArrayList<Boolean> arrayList0 = new ArrayList<Boolean>();
      boolean boolean0 = SIEVE.all(arrayList0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer((-1934));
      boolean boolean0 = arrayList0.add(integer0);
      ArrayList<Boolean> arrayList1 = SIEVE.list_comp((-1), arrayList0);
      assertFalse(arrayList1.contains(boolean0));
      assertEquals(1, arrayList1.size());
  }
}
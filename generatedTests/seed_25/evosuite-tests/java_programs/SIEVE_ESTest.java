/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 09 00:18:27 GMT 2018
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
      Integer integer0 = new Integer((-1));
      ArrayList<Integer> arrayList0 = SIEVE.sieve(integer0);
      ArrayList<Boolean> arrayList1 = SIEVE.list_comp((-1), arrayList0);
      Boolean boolean0 = Boolean.valueOf("?O#.&2^K/Ae");
      arrayList1.add(boolean0);
      boolean boolean1 = SIEVE.all(arrayList1);
      assertEquals(1, arrayList1.size());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ArrayList<Boolean> arrayList0 = new ArrayList<Boolean>();
      boolean boolean0 = SIEVE.all(arrayList0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Integer integer0 = new Integer(2458);
      // Undeclared exception!
      SIEVE.sieve(integer0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ArrayList<Boolean> arrayList0 = new ArrayList<Boolean>();
      Boolean boolean0 = Boolean.valueOf("");
      arrayList0.add(boolean0);
      boolean boolean1 = SIEVE.any(arrayList0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ArrayList<Boolean> arrayList0 = new ArrayList<Boolean>();
      Boolean boolean0 = Boolean.TRUE;
      arrayList0.add(boolean0);
      boolean boolean1 = SIEVE.any(arrayList0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        SIEVE.all((ArrayList<Boolean>) null);
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
        SIEVE.any((ArrayList<Boolean>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer(0);
      arrayList0.add(integer0);
      // Undeclared exception!
      try { 
        SIEVE.list_comp(0, arrayList0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      arrayList0.add((Integer) null);
      // Undeclared exception!
      try { 
        SIEVE.list_comp(0, arrayList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
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
  public void test11()  throws Throwable  {
      Integer integer0 = new Integer(2);
      ArrayList<Integer> arrayList0 = SIEVE.sieve(integer0);
      ArrayList<Boolean> arrayList1 = SIEVE.list_comp((-1), arrayList0);
      assertEquals(1, arrayList1.size());
      assertTrue(arrayList0.contains(2));
  }
}
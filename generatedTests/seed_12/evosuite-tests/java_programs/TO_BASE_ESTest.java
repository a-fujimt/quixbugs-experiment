/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 06 11:24:33 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java_programs.TO_BASE;

public class TO_BASE_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TO_BASE tO_BASE0 = new TO_BASE();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        TO_BASE.to_base(1005, 0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = TO_BASE.to_base((-1426), 27);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        TO_BASE.to_base(1488, (-1047));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

//  @Test(timeout = 4000)
//  public void test4()  throws Throwable  {
//      // Undeclared exception!
//      TO_BASE.to_base(1, 1);
//  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String string0 = TO_BASE.to_base(1005, 1005);
      assertEquals("10", string0);
  }
}

/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 09 01:49:04 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java_programs.WRAP;

public class WRAP_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      String string0 = ".>TD]|_v\\p^g";
      stringArray0[1] = ".>TD]|_vp^g";
      stringArray0[2] = "";
      stringArray0[3] = "RWIn";
      WRAP.main(stringArray0);
      WRAP.main(stringArray0);
      WRAP.main(stringArray0);
      WRAP.wrap("", 630);
      WRAP.wrap("", 630);
      WRAP.wrap("", 0);
      WRAP.wrap("", 0);
      WRAP wRAP0 = new WRAP();
      WRAP.wrap("", 630);
      WRAP.wrap("", 343);
      // Undeclared exception!
      WRAP.wrap("c", 0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int int0 = 3152;
      WRAP.wrap("", 3152);
      String string0 = " ";
      WRAP.wrap(" ", 3152);
      WRAP.wrap("JF8", 3152);
      WRAP wRAP0 = new WRAP();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = " ";
      stringArray0[2] = "JF8";
      WRAP.main(stringArray0);
      WRAP.wrap(" ", 3152);
      String[] stringArray1 = new String[0];
      WRAP.main(stringArray1);
      WRAP.wrap("", 3152);
      String[] stringArray2 = null;
      WRAP.main((String[]) null);
      WRAP.wrap("", 0);
      // Undeclared exception!
      WRAP.wrap(" ", 0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      WRAP.wrap("", 0);
      WRAP.wrap("", 0);
      WRAP wRAP0 = new WRAP();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      stringArray0[6] = "";
      stringArray0[7] = "";
      stringArray0[8] = "";
      WRAP.main(stringArray0);
      assertEquals(9, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        WRAP.wrap("-u #", (-1));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        WRAP.wrap((String) null, (-1784));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
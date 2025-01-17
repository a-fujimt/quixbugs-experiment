/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 05 23:41:25 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java_programs.LEVENSHTEIN;

public class LEVENSHTEIN_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LEVENSHTEIN lEVENSHTEIN0 = new LEVENSHTEIN();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int int0 = LEVENSHTEIN.levenshtein("56!sp`ZlODr}33~rT'", "56!sp`ZlODr}33~rT'");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int int0 = LEVENSHTEIN.levenshtein("J-$z lY&x", "zx)");
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        LEVENSHTEIN.levenshtein((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

//  @Test(timeout = 4000)
//  public void test4()  throws Throwable  {
//      // Undeclared exception!
//      LEVENSHTEIN.levenshtein("Ed0%GP=$A_", ".t<w?+Dbv3dkl'7");
//  }
}

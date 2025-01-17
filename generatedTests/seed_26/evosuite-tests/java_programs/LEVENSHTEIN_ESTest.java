/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 08 19:49:40 GMT 2018
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
      int int0 = LEVENSHTEIN.levenshtein("Thu5}gDf\"N]w>G`W9z", "Thu5}gDf\"N]w>G`W9z");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int int0 = LEVENSHTEIN.levenshtein("e", "Thu5}gDf\"N]w>G`W9z");
      assertEquals(19, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        LEVENSHTEIN.levenshtein((String) null, "t5]Y^Q_o");
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
//      LEVENSHTEIN.levenshtein("Gs^7RAqi@]<P[_f,O", "o6$pq-2OZ^?)");
//  }
}

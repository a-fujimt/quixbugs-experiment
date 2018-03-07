/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 06 00:23:29 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java_programs.LONGEST_COMMON_SUBSEQUENCE;

public class LONGEST_COMMON_SUBSEQUENCE_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LONGEST_COMMON_SUBSEQUENCE lONGEST_COMMON_SUBSEQUENCE0 = new LONGEST_COMMON_SUBSEQUENCE();
      LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("", "");
      String string0 = LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("s[1JL", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = "^tZ@";
      LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("", "^tZ@");
      LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("", (String) null);
      LONGEST_COMMON_SUBSEQUENCE lONGEST_COMMON_SUBSEQUENCE0 = new LONGEST_COMMON_SUBSEQUENCE();
      LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("", (String) null);
      LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("", "Z.dazbIo;J\"");
      // Undeclared exception!
      try { 
        LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence((String) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LONGEST_COMMON_SUBSEQUENCE lONGEST_COMMON_SUBSEQUENCE0 = new LONGEST_COMMON_SUBSEQUENCE();
      LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("$(]O>CR3aVhc6&H r", "$(]O>CR3aVhc6&H r");
      LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("", "");
      LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("", (String) null);
      LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("", "java_programs.LONGEST_COMMON_SUBSEQUENCE");
      String string0 = LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("", "java_programs.LONGEST_COMMON_SUBSEQUENCE");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("", "hDWp|$H(L$Wj6~*");
      String string0 = LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("PH", "hDWp|$H(L$Wj6~*");
      LONGEST_COMMON_SUBSEQUENCE lONGEST_COMMON_SUBSEQUENCE0 = new LONGEST_COMMON_SUBSEQUENCE();
      LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("", "hDWp|$H(L$Wj6~*");
      LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("hDWp|$H(L$Wj6~*", "");
      LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("0", "PH");
      LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("GC5Wh~ipe,SC", "");
      LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("", "");
      LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("GC5Wh~ipe,SC", "");
      LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("", (String) null);
      LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("PH", "PH");
      LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("", "hDWp|$H(L$Wj6~*");
      LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("~!Q+AO7K0E1/ cs`%22", "~!Q+AO7K0E1/ cs`%22");
      String string1 = LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("", "GC5Wh~ipe,SC");
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LONGEST_COMMON_SUBSEQUENCE lONGEST_COMMON_SUBSEQUENCE0 = new LONGEST_COMMON_SUBSEQUENCE();
      String string0 = "~wG'=I1K";
      LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("", "~wG'=I1K");
      String string1 = "hWcBxsn2eEuy";
      // Undeclared exception!
      LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("A}@30Xkz4\"{we:f4]U", "hWcBxsn2eEuy");
  }
}
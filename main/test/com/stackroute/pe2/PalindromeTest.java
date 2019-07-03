package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

Palindrome palindrome;
  @Before
  public void setUp(){
    palindrome = new Palindrome();
  }

  @After
  public void tearDown()  {
    palindrome = null;
  }
  @Test
  public void givenStringContainsStringShouldReturnPalindromeString(){
    //Arrange
    //Act
    String result = palindrome.Palindrome("mom");
    //Assert
    assertEquals("It is a palindrome" ,result);
    //Act
    String result1 = palindrome.Palindrome("56765");
    //Assert
    assertEquals("It is a palindrome" ,result1);
    //Act
    String result2 = palindrome.Palindrome("#$#");
    //Assert
    assertEquals("It is a palindrome" ,result2);
  }
  @Test
  public void givenStringContainsStringShouldReturnNotPalindromeString(){
    //Arrange
    //Act
    String result3 = palindrome.Palindrome("mmo");
    //Assert
    assertEquals("It is not a palindrome" ,result3);
    //Act
    String result4 = palindrome.Palindrome("56675");
    //Assert
    assertEquals("It is not a palindrome" ,result4);
    //Act
    String result5 = palindrome.Palindrome("$%#");
    //Assert
    assertEquals("It is not a palindrome" ,result5);
  }
}

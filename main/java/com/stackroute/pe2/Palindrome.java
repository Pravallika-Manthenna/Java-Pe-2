package com.stackroute.pe2;
  import java.util.Scanner;

public class Palindrome {

    public String Palindrome(String original){
      String result;
      String temp = original;
      String reverse = "";
      int length = original.length();
      for (int i = length - 1 ; i >= 0 ; i--)
      {
        reverse = reverse + original.charAt(i);
      }
      if (reverse.contentEquals(temp)) {
        result = "It is a palindrome";
      }else
        result = "It is not a palindrome";
      return result;
    }
  }




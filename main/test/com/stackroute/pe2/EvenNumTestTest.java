package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTestTest {
  EvenNumTest evennumtest;

  @Before
  public void setUp() {
    System.out.println("before");
    evennumtest = new EvenNumTest();
  }

  @After
  public void tearDown() {
    evennumtest = null;
    System.out.println("after");
  }

  @Test
  public void givenStringContainsIntegerShouldReturnTrue() {
    //Arrange
    //Act
    boolean result = evennumtest.isEven(2);
    //Assert
    assertEquals(true, result);
  }
  @Test
  public void givenStringContainsIntegerShouldReturnFalse() {
    //Arrange
    //Act
    boolean result = evennumtest.isEven(5);
    //Assert
    assertEquals(false, result);
  }
}

package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTestTest {
  EvenNumTest evennumtest;

  @Before
  public void setUp() {
    evennumtest = new EvenNumTest();
  }

  @After
  public void tearDown() {
    evennumtest = null;
  }

  @Test
  public void givenStringContainsIntegerShouldReturnTrue() {
    //Arrange
    //Act
    boolean result = evennumtest.isEven(2);
    //Assert
    assertTrue( result);
  }
  @Test
  public void givenStringContainsIntegerShouldReturnFalse() {
    //Arrange
    //Act
    boolean result = evennumtest.isEven(5);
    //Assert
    assertFalse( result);
  }
}

package com.stackroute.pe2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberTest {
  public static Member member;
  public static Member.MemberVariable memberVariable;
  @BeforeClass
  public static void setUp()
  {
    member = new Member();
    memberVariable=member.new MemberVariable();

  }
  @AfterClass
  public  static  void tearDown(){
    member=null;
    memberVariable=null;
  }
  @Test
  public void testForSetMember(){
    Member m1=memberVariable.setMember("sudha",22,52);
    assertEquals(m1.name,"sudha");
    assertEquals(m1.salary,22,0);
    assertEquals(m1.age,52);

  }
  @Test
  public void testForSetMemberDoubleValue(){
    Member m1=memberVariable.setMember("srikanth",22.60,52);
    assertEquals(m1.name,"srikanth");
    assertEquals(m1.salary,22,60);
    assertEquals(m1.age,52);

  }
  @Test
  public void testForSetMemberNullValue(){
    Member m1=memberVariable.setMember("null",0,50);
    assertEquals(m1.name,"null");
    assertEquals(m1.salary,0,0);
    assertEquals(m1.age,50);

  }

}


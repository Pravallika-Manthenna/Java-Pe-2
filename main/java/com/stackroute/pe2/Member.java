package com.stackroute.pe2;
// program to create member class
public class Member {
  String name;
  int age;
  double salary;


  public class MemberVariable { // method using member variable
    Member member = new Member();
    // method to set values to teh member variable
    public Member setMember(String name, double salary, int age) {

      member.name = name;
      member.salary = salary;
      member.age = age;

      return member;
    }

  }
}


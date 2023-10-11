package com.uningen.gradesubmission;

public class Employee {
  private String fullName;
  private int age;
  private String role;

  public Employee(String fullName, int age, String role) {
    this.fullName = fullName;
    this.age = age;
    this.role = role;
  }

  public Employee() {
  }

  public String getFullName() {
    return this.fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getRole() {
    return this.role;
  }

  public void setRole(String role) {
    this.role = role;
  }

}

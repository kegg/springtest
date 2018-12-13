package com.dreamsense.hello.rest.model;

public class Json {
  
  private String firstName;
  private String lastName;

  public String getFirstName() {
    return firstName;
  }
  
  public String getLastName() {
    return lastName;  
  }
  
  public Json(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }
  
}
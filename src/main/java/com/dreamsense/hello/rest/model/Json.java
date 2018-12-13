package com.dreamsense.hello.rest.model;

import lombok.Data;
import lombok.NonNull;

@Data(staticConstructor = "of")
public class Json {
  
  @NonNull
  private String firstName;
  
  @NonNull
  private String lastName;
  
  @NonNull
  private int age;
  
}
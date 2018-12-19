package com.dreamsense.hello.pages.model;

import lombok.Data;
import lombok.NonNull;

@Data(staticConstructor = "of")
public class Book {
 
  @NonNull
  private String title;
  
  @NonNull
  private String author;
  
}
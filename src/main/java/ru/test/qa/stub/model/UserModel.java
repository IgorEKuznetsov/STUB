package ru.test.qa.stub.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor

@Data
public class UserModel {
  private Long userId;
  private String name;
  private String course;
  private String email;
  private int age;
  private MarkModel mark;

}

package ru.test.qa.stub.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class CourseModel {
  private Long courseId;
  private String name;
  private int price;
}

package ru.test.qa.stub.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.test.qa.stub.model.CourseModel;
import ru.test.qa.stub.service.ICourseService;


import java.util.List;


@RestController
@RequestMapping("/course/get")
public class CourseController {
  ICourseService courseService;

  public CourseController(ICourseService courseService) {
    this.courseService = courseService;
  }

  @GetMapping("/all")
  public List<CourseModel> getAllCourses() {
    return courseService.getAllCourses();
  }
}

package ru.test.qa.stub.service;

import com.github.javafaker.Faker;
import org.springframework.stereotype.Service;
import ru.test.qa.stub.model.CourseModel;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

@Service
public class CourseService implements ICourseService {
  private Faker faker = new Faker();
  @Override
  public List<CourseModel> getAllCourses() {
    return LongStream
        .range(1, 100)
        .mapToObj(id -> new CourseModel(id, faker.name().title(), 1000 + new Random().nextInt(1000)))
        .collect(Collectors.toList());
  }
}

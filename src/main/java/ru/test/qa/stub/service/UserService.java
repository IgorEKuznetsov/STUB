package ru.test.qa.stub.service;

import com.github.javafaker.Faker;
import org.springframework.stereotype.Service;
import ru.test.qa.stub.model.MarkModel;
import ru.test.qa.stub.model.UserModel;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

@Service
public class UserService implements IUserService {
  private Faker faker = new Faker();

  @Override
  public List<UserModel> getAllUsers() {
    return LongStream
        .range(1, 100)
        .mapToObj(id -> new UserModel(id, faker.name().name(), faker.name().title(), id + "@qa.ru", 10 + new Random().nextInt(90), null))
        .collect(Collectors.toList());
  }

  @Override
  public UserModel getUserMarkById(Long id) {
    return new UserModel(id, faker.name().name(), faker.name().title(), id + "@qa.ru", 10 + new Random().nextInt(90),
        new MarkModel("Course mark", new Random().nextInt(10)));
  }
}

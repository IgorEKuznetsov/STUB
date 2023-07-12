package ru.test.qa.stub.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.test.qa.stub.model.UserModel;
import ru.test.qa.stub.service.IUserService;

import java.util.List;


@RestController
@RequestMapping("/user/get")
public class UserController {
  final IUserService userService;

  public UserController(IUserService userService) {
    this.userService = userService;
  }

  @GetMapping("/all")
  public List<UserModel> getAllUsers() {
    return userService.getAllUsers();
  }

  @GetMapping("/{id}")
  public UserModel getUserById(@PathVariable Long id) {
    return userService.getUserMarkById(id);
  }
}

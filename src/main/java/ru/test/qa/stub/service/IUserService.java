package ru.test.qa.stub.service;

import ru.test.qa.stub.model.UserModel;

import java.util.List;

public interface IUserService {
  List<UserModel> getAllUsers();
  UserModel getUserMarkById(Long id);
}

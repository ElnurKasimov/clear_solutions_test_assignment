package com.clearsolution.testAssignment.service;



import com.clearsolution.testAssignment.model.User;

import java.util.List;

public interface UserService {
    User create(User user);
    User readById(long id);
    User update(User user);
    void delete(long id);
    List<User> getAll();
    User findByEmail(String email);
}

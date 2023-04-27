package com.ssafy.enjoytrip.model.Service;

import com.ssafy.enjoytrip.model.User;

import java.sql.SQLException;
import java.util.List;

public interface UserService {
    User login(User user) throws Exception;

    void join(User user);

    User findPassword(User map) throws SQLException;

    List<User> userList();
}

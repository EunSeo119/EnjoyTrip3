package com.ssafy.enjoytrip.model.mapper;

import com.ssafy.enjoytrip.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.sql.SQLException;
import java.util.List;

@Mapper
public interface UserMapper {
    User selectUserLogin(User user) throws SQLException;

    void insertUser(User user);

    List<User> selectUserList();
}

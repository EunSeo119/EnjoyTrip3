package com.ssafy.enjoytrip.model.Service;

import com.ssafy.enjoytrip.model.User;
import com.ssafy.enjoytrip.model.mapper.UserMapper;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User login(User user) throws SQLException {
        return userMapper.selectUserLogin(user);
    }

    @Override
    public void join(User user) {
        userMapper.insertUser(user);
    }

    @Override
    public User findPassword(User map) throws SQLException {
        return userMapper.selectUserLogin(map);
    }

    @Override
    public List<User> userList() {
        return userMapper.selectUserList();
    }

    @Override
    public Map<String, Object> selectUserDetail(String userId) {
        return userMapper.selectDetailUser(userId);
    }
}

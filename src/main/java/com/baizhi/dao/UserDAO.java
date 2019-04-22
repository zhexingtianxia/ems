package com.baizhi.dao;

import com.baizhi.entity.User;

public interface UserDAO {
    User login(String username);
    void register(User user);
    void exit();
}

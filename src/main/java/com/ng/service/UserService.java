package com.ng.service;

import com.ng.po.User;

public interface UserService {

    User checkUser(String username, String password);
}

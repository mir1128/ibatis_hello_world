package com.howtodoinjava.ibatis.demo;

import com.ibatis.sqlmap.client.SqlMapClient;

public interface UserDao {
    UserTEO addUser(UserTEO user, SqlMapClient sqlmapClient);

    UserTEO getUserById(Integer id, SqlMapClient sqlmapClient);

    void deleteUserById(Integer id, SqlMapClient sqlmapClient);
}

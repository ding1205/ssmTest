package com.mhys.mapper;

import com.mhys.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserMapper {
    List<User>findAll();
    List<User>findByName(User user);
    int delByid(int id);
    int insertUser(User user);
    User selectByID (User user);
    int updateById(User user);
}

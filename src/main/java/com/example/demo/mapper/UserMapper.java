package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.springframework.stereotype.Repository;
/**
 * @author lyp
 */
@Repository
public interface UserMapper {
    User selectUserById(String userId);
    //int updateByPrimaryKey(User user);
}

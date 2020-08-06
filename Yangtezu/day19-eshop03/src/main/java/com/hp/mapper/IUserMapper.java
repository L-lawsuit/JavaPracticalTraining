package com.hp.mapper;

import com.hp.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserMapper {

    @Select("select * from s_user where username=#{username} and type=1")
    User selectUserByName(String username);

    @Insert("insert into s_user values (#{id},#{username},#{password},#{type})")
    int addUser(User registerUser);
}

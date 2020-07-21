package com.serviec;

/**
 * @author gousheng
 * @date ${Date}- 11:09
 */

import com.pojo.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import java.util.List;

/**该接口功能有
*   增加用户
    删除指定用户
    遍历用户
    修改用户权限
    按姓名查询用户
    按用户名删除用户
*/
//用户业务接口
    @Mapper
public interface UserServiceIf {

    //增加用户
    @Insert(" insert into user (name,user_name,user_password,power) values (#{name},#{user_name},#{user_password},#{power}) ")
    public int addUser(User user);
    //删除指定用户
    @Delete("delete  from user where name=#{name}")
    public void removeUser(String name);
    //遍历用户
    @Select("select * from user")
    public List<User> referUser();
    //修改指定用户权限
    @Update("update  user set power =#{power} where user_name=#{user_name}")
    public void updateUser(User user);
    //按姓名查询用户
    @Select("select * from user where name =#{name}")
    public List<User> findUser(String name);


}

package cn.pepper.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.pepper.model.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

	List<User> selectAll();

	User selectByNameAndPwd(@Param("username")String username, @Param("password")String password);
}
package io.github.lostblackknight.mybatis.mapper;

import io.github.lostblackknight.mybatis.domain.User;

import java.util.List;

/**
 * @author chensixiang chensixiang1234@gmail.com
 */
public interface UserMapper {

    List<User> selectAll();
}

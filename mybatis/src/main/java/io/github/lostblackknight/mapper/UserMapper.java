package io.github.lostblackknight.mapper;

import io.github.lostblackknight.domain.User;

import java.util.List;

/**
 * @author chensixiang chensixiang1234@gmail.com
 */
public interface UserMapper {

    List<User> selectAll();
}

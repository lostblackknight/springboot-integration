package io.github.lostblackknight.mybatis.domain;

import lombok.Data;

/**
 * @author chensixiang chensixiang1234@gmail.com
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}

package io.github.lostblackknight.mybatis.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author chensixiang chensixiang1234@gmail.com
 */
@Configuration
@MapperScan("io.github.lostblackknight.mybatis.mapper")
public class MybatisConfig {
}

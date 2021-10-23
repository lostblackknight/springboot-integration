package io.github.lostblackknight.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author chensixiang chensixiang1234@gmail.com
 */
@Configuration
@MapperScan("io.github.lostblackknight.mapper")
public class MybatisConfig {
}

package io.github.lostblackknight;

import io.github.lostblackknight.mapper.UserMapper;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@AllArgsConstructor
public class MybatisApplication {

    private final UserMapper userMapper;

    public static void main(String[] args) {
        SpringApplication.run(MybatisApplication.class, args);
    }

    @Bean
    CommandLineRunner runner() {
        return args -> {
          userMapper.selectAll().forEach(System.out::println);
        };
    }
}

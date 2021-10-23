package io.github.lostblackknight;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.github.lostblackknight.mapper.UserMapper;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@AllArgsConstructor
public class MybatisPlusApplication {

    private final UserMapper userMapper;

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusApplication.class, args);
    }

    @Bean
    CommandLineRunner runner() {
        return args -> {
            userMapper.selectList(null).forEach(System.out::println);
            userMapper.selectPage(Page.of(1,2),null).getRecords().forEach(System.out::println);
        };
    }
}

package com.imlegend.garbage_classification;

/**
 * Created By IntelliJ IDEA
 *
 * @Author: Fantastic_Liar
 * @Date: 2019/11/9 10:53
 */

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Slf4j
@SpringBootApplication
public class GarbageClassificationApplication {

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
    public static void main(String[] args) {
        SpringApplication.run(GarbageClassificationApplication.class, args);
        log.info("hello {}","world");
    }

}

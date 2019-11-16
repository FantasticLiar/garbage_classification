package com.imlegend.gccore;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.imlegend.gccore.*.mapper")
public class GcCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(GcCoreApplication.class, args);
	}

}

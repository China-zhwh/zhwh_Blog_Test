package com.zhwh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan(basePackages={"com.zhwh.repository","com.zhwh.service"})
@SpringBootApplication
public class ZhwhBlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZhwhBlogApplication.class, args);
	}

}

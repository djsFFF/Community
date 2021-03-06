package com.djs.community.community;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.djs.community.community.dao"})
public class CommunityApplication {
	// 1
	public static void main(String[] args) {
		SpringApplication.run(CommunityApplication.class, args);
	}

}

package com.in28minutes.superstore;

import com.in28minutes.superstore.dao.UserDao;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@MapperScan("com.in28minutes.superstore.dao")
public class SuperstoreApplication {
	public static void main(String[] args) {
		SpringApplication.run(SuperstoreApplication.class, args);
	}

}

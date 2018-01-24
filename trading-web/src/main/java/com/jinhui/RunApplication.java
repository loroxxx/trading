package com.jinhui;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@MapperScan("com.jinhui.mapper")//扫描Mapper接口
@SpringBootApplication
public class RunApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(RunApplication.class, args);
	}


	//继承SpringBootServletInitializer,用于war包启动
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(RunApplication.class);
	}


}

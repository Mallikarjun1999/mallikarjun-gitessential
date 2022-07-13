package com.XYRAM.Crud_Operation;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.context.annotation.RequestScope;

import com.XYRAM.Crud_Operation.Repository.StudentRepository;
@SpringBootApplication(exclude = {HibernateJpaAutoConfiguration.class })
@ComponentScan(basePackages = { "com.XYRAM.Crud_Operation" })
@EnableAutoConfiguration()
@EnableJpaAuditing
@Configuration 
public class CrudOperationApplication extends SpringBootServletInitializer {
	

	public static void main(String[] args) {
		SpringApplication.run(CrudOperationApplication.class, args);
	}
	
	
	
	

}

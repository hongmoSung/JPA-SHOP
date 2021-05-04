package jpabook.jpashop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpashopApplication {

	public static void main(String[] args) {

		Hello hello = new Hello();
		hello.setHello("hello");
		final String hello1 = hello.getHello();
		System.out.println(hello1);
		SpringApplication.run(JpashopApplication.class, args);
	}

}

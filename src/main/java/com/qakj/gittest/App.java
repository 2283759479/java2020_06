package com.qakj.gittest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.qakj.gittest")
public class App {
		public static void main(String[] args) throws Exception {
			SpringApplication.run(App.class, args);
		}

}

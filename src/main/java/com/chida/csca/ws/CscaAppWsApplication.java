package com.chida.csca.ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class CscaAppWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CscaAppWsApplication.class, args);
	}

	/**
	 * BCryptPasswordEncoder is used to encrypt the member password.
	 * It is a password hashing function based on Blowfish cipher
	 * This class is declared as Bean so that we can autowire it from our Service class
	 * @return
	 */
	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

}

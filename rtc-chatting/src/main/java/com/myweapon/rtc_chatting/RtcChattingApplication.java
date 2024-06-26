package com.myweapon.rtc_chatting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class RtcChattingApplication {

	public static void main(String[] args) {
		SpringApplication.run(RtcChattingApplication.class, args);
	}

}

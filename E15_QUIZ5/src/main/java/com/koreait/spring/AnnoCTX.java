package com.koreait.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnoCTX {
	
	@Bean
	public Gun gun() {
		Gun gun = new Gun();
		gun.setModel("베레타");
		gun.setBullet(6);
		
		return gun;
	}
	
}

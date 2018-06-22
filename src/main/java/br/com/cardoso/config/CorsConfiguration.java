package br.com.cardoso.config;

import org.springframework.web.servlet.config.annotation.CorsRegistry;

public class CorsConfiguration extends ApplicationWebMvcConfigurer {

	@Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**");
    }
	
}
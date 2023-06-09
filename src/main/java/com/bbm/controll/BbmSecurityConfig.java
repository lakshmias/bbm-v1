package com.bbm.controll;

import java.util.Arrays;

import org.apache.catalina.filters.CorsFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@EnableWebSecurity(debug = true)
public class BbmSecurityConfig {
	
	@Autowired
	BbmAuthProvider bbmAuthProvider;

	@Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) 
      throws Exception {
		auth.authenticationProvider(bbmAuthProvider)
        ;
    }

	@Bean
	public PasswordEncoder passwordEncoder() 
	{
    	return new BCryptPasswordEncoder();
	}

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception 
	{
		http.authorizeHttpRequests()
		.requestMatchers("/**").permitAll()
		// .requestMatchers("/welcome/**").permitAll()
		// .requestMatchers("/welcomeProcedure/**").permitAll()
		// .requestMatchers("/specimen/**").authenticated()
		// .requestMatchers("/procedure/**").authenticated()
		.requestMatchers("/v2/api-docs",
						"/v3/api-docs/**",
						"/swagger-resources/configuration/ui",  
						"/swagger-resources/configuration/security", 
						"/webjars/**",
						"/swagger-ui.html","/swagger-ui/**").permitAll()
		.and().httpBasic();
		//http.httpBasic();
		//http.cors();
		http.csrf().disable(); // 403forbidden error
		return http.build();
		
	}
	
	@Bean
	public AuthenticationManager authManager(HttpSecurity http) throws Exception {

		AuthenticationManagerBuilder authenticationManagerBuilder = http
				.getSharedObject(AuthenticationManagerBuilder.class);
		authenticationManagerBuilder.authenticationProvider(bbmAuthProvider);
		return authenticationManagerBuilder.build();
	}

	@Bean
    public CorsFilter corsFilter() {
        final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        final CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);
        config.addAllowedOrigin("*"); // this allows all origin
        config.addAllowedHeader("*"); // this allows all headers
        config.addAllowedMethod("OPTIONS");
        config.addAllowedMethod("HEAD");
        config.addAllowedMethod("GET");
        config.addAllowedMethod("PUT");
        config.addAllowedMethod("POST");
        config.addAllowedMethod("DELETE");
        config.addAllowedMethod("PATCH");
        config.setExposedHeaders(Arrays.asList("Authorization"));
        config.setMaxAge((long) 3600000);
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter();
    }

	@Bean
	public PasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}

}

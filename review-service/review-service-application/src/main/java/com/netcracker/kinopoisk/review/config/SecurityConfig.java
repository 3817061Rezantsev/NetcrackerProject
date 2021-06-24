package com.netcracker.kinopoisk.review.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

import com.netcracker.kinopoisk.review.impl.security.JwtConfigurer;
import com.netcracker.kinopoisk.review.impl.security.JwtTokenProvider;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final JwtTokenProvider jwtTokenProvider;

    private static final String LOGIN_ENDPOINT = "/api/auth/login";
    private static final String SWAGGER_ENDPOINT = "/swagger-ui/**";
    private static final String FILM_ENDPOINT = "/review/film/**";
    private static final String COMMENT_ENDPOINT = "/review/comment/**";
    private static final String REVIEW_ENDPOINT = "/review/review/**";
    private static final String ROLE_ENDPOINT = "/review/role/**";
    private static final String USER_ENDPOINT = "/review/user/**";

    @Autowired
    public SecurityConfig(JwtTokenProvider jwtTokenProvider) {
        this.jwtTokenProvider = jwtTokenProvider;
    }

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .httpBasic().disable()
                .csrf().disable()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .authorizeRequests()
                .antMatchers(SWAGGER_ENDPOINT).permitAll()
                .antMatchers(FILM_ENDPOINT).permitAll()
                .antMatchers(COMMENT_ENDPOINT).permitAll()
                .antMatchers(REVIEW_ENDPOINT).permitAll()
                .antMatchers(USER_ENDPOINT).permitAll()
                .antMatchers(ROLE_ENDPOINT).permitAll()
                .antMatchers(LOGIN_ENDPOINT).permitAll()
                .anyRequest().authenticated()
                .and()
                .apply(new JwtConfigurer(jwtTokenProvider));
    }
}

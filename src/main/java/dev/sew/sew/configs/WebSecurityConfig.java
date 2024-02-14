//package dev.sew.sew.configs;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfiguration {
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//            .authorizeRequests()
//                .antMatchers("/", "/home").permitAll() // allow unauthenticated access to these paths
//                .anyRequest().authenticated() // all other requests require authentication
//            .and()
//            .formLogin()
//                .loginPage("/login") // specify custom login page
//                .permitAll();
//    }
//}
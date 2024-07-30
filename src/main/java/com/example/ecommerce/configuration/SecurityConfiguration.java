package com.example.ecommerce.configuration;

import com.example.ecommerce.srvice.UserRepo;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import static java.lang.String.format;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    private final UserRepo userRepo;

    public SecurityConfiguration(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(username -> userRepo
//                .findByUsername(username)
//                .orElseThrow(
//                        () -> new UsernameNotFoundException(
//                                format("User: %s, not found", username)
//                        )
//                ));
//    }

    @Override
    protected void configure(HttpSecurity http)  throws Exception {
        http.authorizeRequests()
                .antMatchers("/products/**")
                .permitAll()
                .and()
                .formLogin();
    }

//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication().withUser("user").password("password").roles("USER");
//    }
//
//    @Override
//    protected void configure(HttpSecurity http)  throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/products/**")
//                .permitAll()
//                .and()
//                .formLogin();
//    }
    @Bean
    public PasswordEncoder getPasswordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }
}

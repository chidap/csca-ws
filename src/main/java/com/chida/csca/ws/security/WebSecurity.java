package com.chida.csca.ws.security;

import com.chida.csca.ws.service.MemberService;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 *  WebSecurity will make sure only Sign-up Web service endpoint which is defined as public can be accessible
 *  and protect other endpoint from accessing from unauthenticated users. All protected methods can be assicible with JWT token
 */
@EnableWebSecurity
public class WebSecurity extends WebSecurityConfigurerAdapter {

    private final MemberService memberService;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    /**
     *  Constructor
     * @param memberService
     * @param bCryptPasswordEncoder
     */
    public WebSecurity(MemberService memberService, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.memberService = memberService;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    /**
     * This method make sure only Sign-up end point is public and accessible without any authentication
     * All other endpoints can be accisible post authentication
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().authorizeRequests()
                .antMatchers(HttpMethod.POST, "/csca/members")
                .permitAll()
                .anyRequest().authenticated();
    }

    /**
     *  Method to protect and enode password
     * @param auth
     * @throws Exception
     */

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(memberService).passwordEncoder(bCryptPasswordEncoder);
    }
}

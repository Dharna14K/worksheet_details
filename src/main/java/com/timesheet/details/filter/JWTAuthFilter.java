package com.timesheet.details.filter;

import com.timesheet.details.utility.JWTAuthentication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class JWTAuthFilter extends OncePerRequestFilter {
    @Autowired
    private JWTAuthentication jwtAuthentication;

   // Logger LOGGER= LoggerFactory.getLogger(JWTAuthFilter.class);

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

      //  LOGGER.info("Entered Inside doFilterInternal Method");
        if (("/welcome".equals(request.getRequestURI())){
            filterChain.doFilter(request, response);
        }

    //    if (!("/welcome".equals(request.getRequestURI()))) {
        else{
           String jwtToken = request.getHeader("JWT-Token");
           System.out.println("Here is our token "+jwtToken);
            if ((jwtToken.isEmpty()) || !(jwtAuthentication.authenticate(jwtToken))) {
               return;
           }
        }

    }
}

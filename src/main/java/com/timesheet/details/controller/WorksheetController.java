package com.timesheet.details.controller;

import com.timesheet.details.utility.JWTAuthentication;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
/*import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;*/
import org.springframework.web.bind.annotation.*;


@RestController
public class WorksheetController {

    @Autowired
    private JWTAuthentication jwtAuthentication;


    Logger log = LoggerFactory.getLogger(WorksheetController.class);

    @GetMapping("/welcome")
    public String greeting() {
        String name="dharna";
        log.debug("Request {}", name);
        String response = "Hi " + name + " Welcome to Java Techie";
        log.debug("Response {}", response);
        return response;
    }

    @RequestMapping("/welcomekro")
    public String worksheet(){

       return  jwtAuthentication.generateToken();

    }
    @GetMapping("/worksheet")
    public String getWorksheet() {
       return "Here is the worksheet";
    }

    //retrieve expiration date from jwt token
   /* public Date getExpirationDateFromToken(String token) {
        return getClaimFromToken(token, Claims::getExpiration);
    }


    public <T> T getClaimFromToken(String token, Function<Claims, T> claimsResolver) {
        final Claims claims = getAllClaimsFromToken(token);
        return claimsResolver.apply(claims);
    }


    //for retrieving any information from token we will need the secret key
    private Claims getAllClaimsFromToken(String token) {
        return Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token).getBody();
    }


    //check if the token has expired
    private Boolean isTokenExpired(String token) {
        final Date expiration = getExpirationDateFromToken(token);
        return expiration.before(new Date());
    }*/
   /* @PostMapping("/authenticate")
    public JwtResponse authenticate(@RequestBody JwtRequest jwtRequest) {


            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            jwtRequest.getUsername(),
                            jwtRequest.getPassword()
                    )
            );


        final UserDetails userDetails
                = userService.loadUserByUsername(jwtRequest.getUsername());

        final String token =
                jwtUtility.generateToken(userDetails);

        return  new JwtResponse(token);
    }*/



}

package com.timesheet.details.utility;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class JWTAuthentication {
    @Value("${jwt.secret}")
    private String secretKey;

    public String generateToken() {
        Map<String, Object> claims = new HashMap<>();
        claims.put("key1","value1");
        claims.put("key2","value2");
        return Jwts.builder().setClaims(claims).setSubject("xyz").setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() +  2000 * 60 * 60))
                .signWith(SignatureAlgorithm.HS512, secretKey).compact();
    }

    public boolean authenticate(String jwtToken) {

        if (Jwts.parser().setSigningKey(secretKey).parseClaimsJws(jwtToken)!=null){
            return true;
        }
        return false;
    }
}

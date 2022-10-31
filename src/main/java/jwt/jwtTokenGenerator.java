package jwt;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

public class jwtTokenGenerator {

    public String jwtToken()
    {
        return Jwts.builder()
                .setSubject("test")
                .setIssuedAt(new Date(new Date().getTime()))
                .signWith(SignatureAlgorithm.HS256,"grpc server with java").compact();

    }
}

package com.wangashu.utils;

import com.wangashu.exception.LeaseException;
import com.wangashu.result.ResultCodeEnum;
import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;

import javax.crypto.SecretKey;
import java.util.Date;

public class JwtUtil {

    private static long tokenExpiration =60 * 60 * 1000L;
    private static SecretKey tokenSignKey = Keys.hmacShaKeyFor("M0PKKI6pYGVWWfDZw90a0lTpGYX1d4AQ".getBytes());

    public static String createToken(Long userId, String username) {
        String token = Jwts.builder().
                setSubject("USER_INFO").
                setExpiration(new Date(System.currentTimeMillis() + tokenExpiration)).
                claim("userId", userId).
                claim("username", username).
                signWith(tokenSignKey).
                compact();
        return token;
    }

    // 解析token
    public  static  Claims  parserToken(String token){
        if (token==null){
            //没有登录 相当于 token为空
            throw new LeaseException(ResultCodeEnum.ADMIN_LOGIN_AUTH);
        }
        try {
            JwtParser jwtParser = Jwts.parserBuilder().setSigningKey(tokenSignKey).build();
            Jws<Claims> claimsJws = jwtParser.parseClaimsJws(token);
            // 自己设置的 userId 和 userName  放在body里面
            return claimsJws.getBody();
        }catch (ExpiredJwtException e){
            throw new LeaseException(ResultCodeEnum.TOKEN_EXPIRED);
        }catch (JwtException e){
            throw new LeaseException(ResultCodeEnum.TOKEN_INVALID);
        }



    }

    public static void main(String[] args) {
        System.out.println( createToken(2L,"17633759664"));
    }

}
package com.marvel.marvel.service;



import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import com.marvel.marvel.model.CharactersResponse;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class MarvelService {

    private static final String PUBLIC_KEY = "3d5e740d444b03daba0a758c769c5ca3";
    private static final String PRIVATE_KEY = "b05adbc9a76a570ef429059f9c17bfdc7a2d583c";
    
    private MarvelFeignClient client;

    public CharactersResponse findAll() {
        Long timeStamp = 1l;
        return client.findAll(timeStamp, PUBLIC_KEY, getHashMd5(timeStamp + PRIVATE_KEY + PUBLIC_KEY));
    }

    public static String getHashMd5(String value) {
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        BigInteger hash = new BigInteger(1, md.digest(value.getBytes()));
        return hash.toString(16);
    }

    
}

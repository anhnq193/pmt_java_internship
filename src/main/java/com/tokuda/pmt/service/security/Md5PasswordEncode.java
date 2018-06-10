package com.tokuda.pmt.service.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.security.NoSuchAlgorithmException;

@Component("md5PasswordEncode")
public class Md5PasswordEncode implements PasswordEncoder {

    private final Md5Hash md5Hash;

    @Autowired
    public Md5PasswordEncode(Md5Hash md5Hash) {
        this.md5Hash = md5Hash;
    }

    @Override
    public String encode(CharSequence rawPassword) {
        try {
            return md5Hash.getMd5Hash(rawPassword.toString().getBytes());
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        String md5Hash = null;
        try {
            md5Hash = this.md5Hash.getMd5Hash(rawPassword.toString().getBytes());
            return md5Hash.equals(encodedPassword);
        } catch (NoSuchAlgorithmException e) {
            return false;
        }
    }


}

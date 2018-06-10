package com.tokuda.pmt.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.MapBindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.Arrays;
import java.util.List;

@RestController
public class MainController {
    @GetMapping
    public List<String> securityInfo(Authentication authentication, Principal principal){
        String authName = authentication.getName();
        String prinName = principal.getName();
        return Arrays.asList(authName, prinName);
    }
}

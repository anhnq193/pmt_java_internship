package com.tokuda.pmt.controller;

import org.springframework.boot.web.servlet.view.MustacheView;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.InternalResourceView;

@Controller
@RequestMapping("/page/v1/return-test")
public class ModelAndViewController {
    @GetMapping
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setView(new InternalResourceView());
        return modelAndView;
    }
}

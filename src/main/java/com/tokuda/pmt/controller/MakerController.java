package com.tokuda.pmt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page/v1/maker")
public class MakerController {
    @GetMapping
    public String index(){
        return "redirect:/maker.html";
    }

    @GetMapping("/create")
    public String create(){
        return "redirect:/maker-create.html";
    }

    @GetMapping("/{id}/edit")
    public String edit(){
        return "redirect:/maker-edit.html";
    }
}

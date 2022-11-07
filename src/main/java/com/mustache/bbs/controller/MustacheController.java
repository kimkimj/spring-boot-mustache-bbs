package com.mustache.bbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MustacheController {

    // greetings 파일이 변했기 때문에 이 path는 404가 나온다
    @GetMapping(value = "/hi")
    public String mustacheCon(Model model){
        // greetings 로 넘길 parameter
        model.addAttribute("username", "lulu");
        return "greetings";
    }

    @GetMapping(value = "/hi/{id}")
    public String mustacheCon(@PathVariable String id, Model model){
        // greetings 로 넘길 parameter
        model.addAttribute("username", "lulu");
        model.addAttribute("id", id);
        return "greetings";
    }
}

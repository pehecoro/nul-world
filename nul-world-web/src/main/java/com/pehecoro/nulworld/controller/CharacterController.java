package com.pehecoro.nulworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CharacterController {

    @RequestMapping({"/characters", "/characters/index", "/characters/index.html"})
    public String index(){

        return "characters/index";
    }

}

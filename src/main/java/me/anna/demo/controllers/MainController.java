package me.anna.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    // Display the home page
    @GetMapping("/")
    public String showAgency()
    {
        return "index";
    }
}
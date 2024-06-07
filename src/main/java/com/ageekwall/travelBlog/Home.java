package com.ageekwall.travelBlog;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    @GetMapping
    public String welcome() {
        return "Welcome to Travel Blog";
    }

    @GetMapping("/home")
    public String home() {
        return "This is home page";
    }
}

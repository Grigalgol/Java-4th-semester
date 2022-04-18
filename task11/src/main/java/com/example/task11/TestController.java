package com.example.task11;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class TestController {
    @GetMapping("/{name}")
    public String hello(Model m, @PathVariable String name) {
        m.addAttribute("name", name);
        return "hello";
    }
}

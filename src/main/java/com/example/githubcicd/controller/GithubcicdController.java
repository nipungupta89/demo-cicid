package com.example.githubcicd.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GithubcicdController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Hello World using CI/CD pipeline";
    }
}

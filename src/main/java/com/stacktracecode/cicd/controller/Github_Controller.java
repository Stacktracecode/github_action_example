package com.stacktracecode.cicd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Github_Controller {

    @RequestMapping("/welcome")
    public String welcome(){
        return "welcome to stracktrace_code";
    }
}

//echo "# github_action_example" >> README.md
//        git init
//        git add README.md
//        git commit -m "first commit"
//        git branch -M main
//        git remote add origin https://github.com/Stacktracecode/github_action_example.git
//        git push -u origin main

package com.se.projects.mywebexample.myexample.controller;

import com.se.projects.mywebexample.myexample.model.Friend;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String showHome(Model m){
        m.addAttribute("username","Saroj");
        List<Friend> friendList = Arrays.asList(new Friend("James",1), new Friend("Rose",2),
                new Friend("Johnson",3), new Friend("Aakshya", 4));
        m.addAttribute("friendList", friendList);
        return "/home";
    }

}

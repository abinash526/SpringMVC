package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class UserController {


    @RequestMapping("/")
    public ModelAndView welcome()
    {
        ModelAndView mv=new ModelAndView("index");

        User user=new User("Welcome to Stackroute");
        mv.addObject("message",user.getMessage());
        return mv;
    }
    @RequestMapping("print")
    public void print(Model model)
    {

        System.out.println("Hello");
    }

}

package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
    @RequestMapping("login")
    public ModelAndView login(@RequestParam String Name,@RequestParam String Password){
        User user=new User(Name,Password);
        ModelAndView modelAndView=new ModelAndView("welcome");
        modelAndView.addObject("username",user.getName());
        return modelAndView;
    }
}

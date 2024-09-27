package org.bytetech.controller;

import org.bytetech.model.Alien;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("/add")
    public ModelAndView add(int num1, int num2, ModelAndView mv) {
        mv.addObject("result", num1 + num2);
        mv.setViewName("result");
        return mv;
    }

}
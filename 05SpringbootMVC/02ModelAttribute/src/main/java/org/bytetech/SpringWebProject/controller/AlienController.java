package org.bytetech.SpringWebProject.controller;

import org.bytetech.SpringWebProject.model.Alien;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AlienController {

    @PostMapping("addAlien")
    public ModelAndView addAlien(@ModelAttribute Alien alien, ModelAndView mv) {

        mv.addObject("result", alien);
        mv.setViewName("result");
        return mv;
    }

}

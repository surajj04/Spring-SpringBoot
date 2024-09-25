package org.bytetech.SpringWebProject.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    /*  @RequestMapping("/add")
    public String add(HttpServletRequest req, HttpSession session) {

        int n1 = Integer.parseInt(req.getParameter("num1"));
        int n2 = Integer.parseInt(req.getParameter("num2"));
        int result = n1 + n2;

        session.setAttribute("result", result);

        return "result.jsp";
    }   */


    /*  @RequestMapping("/add")
    public String add(@RequestParam("num1") int num, int num2, HttpSession session) {
        session.setAttribute("result", num + num2);
        return "result.jsp";
    }   */

    /*  @RequestMapping("/add")
    public String add(@RequestParam("num1") int num, int num2, Model model) {
        model.addAttribute("result", num + num2);
        return "result";
    }   */


    @RequestMapping("/add")
    public ModelAndView add(@RequestParam("num1") int num, int num2, ModelAndView mv) {
        mv.addObject("result", num + num2);
        mv.setViewName("result");
        return mv;
    }

}

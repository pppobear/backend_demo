package cn.pppobear.demo.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("/")
    public ModelAndView index() {
        String msg = "123";
        ModelAndView modelAndView = new ModelAndView("hello");
        modelAndView.addObject("msg", msg);
        return modelAndView;
    }
}

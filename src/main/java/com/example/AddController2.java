package com.example;

import com.example.service.AddService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController2 {

    @RequestMapping("/addFunction")
    public ModelAndView addNumbers(@RequestParam("n1") double firstNumber, @RequestParam("n2") double secondNumber) {
        double result = new AddService().add(firstNumber, secondNumber);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("result", result);
        modelAndView.setViewName("display");
        return modelAndView;
    }

}

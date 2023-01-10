package com.example;

import com.example.service.AddService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {

    @RequestMapping("/add")
    public ModelAndView add(@RequestParam("n1") double firstNumber, @RequestParam("n2") double secondNumber,
                            HttpServletRequest request, HttpServletResponse response) {

//        double firstNumber = Double.parseDouble(request.getParameter("n1"));
//        double secondNumber = Double.parseDouble(request.getParameter("n2"));

        AddService addService = new AddService();
        double result = addService.add(firstNumber, secondNumber);

        //  For send the result we need the ModelAndView object, so we can pass data
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("display");
        // Here the result in double quests is a label  for result object
        modelAndView.addObject("result", result);

        return modelAndView;
    }
}

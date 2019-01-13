/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensat.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

/**
 *
 * @author AGBALU Hanane
 */
@Controller
public class HomeController {
    @RequestMapping(value="/hello")
    public String showIndex(){
        //ModelAndView model=new ModelAndView("hello");
        //model.addObject(model);
        return "hello";
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensat.Controller;


import com.ensat.DAO.PostDAO;
import com.ensat.services.PostServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

/**
 *
 * @author AGBALU Hanane
 */
@Controller
public class HomeController {
    // @Autowired
    // public PostServices ps;
    @RequestMapping(value="/hello")
    public ModelAndView showIndex(){
        ModelAndView model=new ModelAndView("post");
       model.addObject("listPost","lkm");
        return model;
    }
}

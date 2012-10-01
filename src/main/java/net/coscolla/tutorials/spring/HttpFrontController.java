package net.coscolla.tutorials.spring;

import net.coscolla.tutorials.spring.dao.IUserDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HttpFrontController {
	@Autowired IUserDao dao;
	
    @RequestMapping(method=RequestMethod.GET, value="/hello")
    public ModelAndView hello()
    {
    	ModelAndView mv = new ModelAndView("jsonView");
    	mv.addObject("HELLO", "WORLD!");
    	
    	return mv;
    }
    
    @RequestMapping(method=RequestMethod.GET, value="/user")
    public ModelAndView getUserById(@RequestParam("id") long id)
    {
    	ModelAndView mv = new ModelAndView("jsonView");
    	mv.addObject(dao.getById(id));
    	
    	return mv;
    }
    
    @RequestMapping(method=RequestMethod.GET, value="/user/{id}")
    public ModelAndView getUserById_2(@PathVariable("id") long id)
    {
    	ModelAndView mv = new ModelAndView("jsonView");
    	mv.addObject(dao.getById(id));
    	
    	return mv;
    }
}

package com.app.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.app.entity.Employee;

@Controller
public class HomeController {
	
	@RequestMapping("/show")
		public ModelAndView showDate()
		{
		
		
		
		ModelAndView mv=new ModelAndView();
			mv.setViewName("home");
		//create the entity class object and set the values
			Employee emp=new Employee();
				emp.setId(1001);emp.setName("Pratik");

			mv.addObject("empData",emp);
		
				
				//create the list and set the data
				List<String> data= new ArrayList<String>();
				data.add("Pune"); data.add("Mumbai");
				
				mv.addObject("listData",data);
				
				//create the map and set the data
				Map<Integer, String> map=new TreeMap<Integer, String>();
					map.put(12, "Proj1");map.put(10, "Proj2");map.put(11, "Proj3");
				mv.addObject("mapData",map);
				
				//create the array and set the data
					Object[] arr= {10,22,25};
						mv.addObject("arrayData",arr);
				
				
			return mv;
		
		}
/*	@RequestMapping
	public ModelAndView viewSignupPage (HttpServletRequest request,	HttpServletResponse response) throws Exception {
	ModelAndView modelAndView=new ModelAndView("home");
    modelAndView.addObject("message", "Hello");
    return modelAndView;
	}*/
	//@RequestMapping
/*	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		ModelAndView modelAndView=new ModelAndView("home");
	    modelAndView.addObject("message", "Hello");
	    return modelAndView;
	}*/

}

package com.ssa.archive;

import java.util.HashMap;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@ComponentScan(basePackages="com.ssa")
public class WebsiteController {

	@RequestMapping("/about")
	public ModelAndView about(HttpServletRequest request, ModelAndView mv) {
//		if(request.getParameter("name") != null) {
//			mv.addObject("name", request.getParameter("name"));
//		}
		mv.setViewName("about");
		return mv;
	}
	
	@RequestMapping("/")
	public ModelAndView home(HttpServletRequest request, ModelAndView mv) {
		if(request.getParameter("name") != null) {
			mv.addObject("name", request.getParameter("name"));
		}
		mv.setViewName("home");
		return mv;
	}
	
	
	@RequestMapping("/help")
	public ModelAndView help(HttpServletRequest request, ModelAndView mv) {
		if(request.getParameter("id") != null) {
		//	mv.addObject("id", request.getParameter("id"));
		  //mv.addObject("desc", request.getParameter("desc"));
		}
		HashMap<Integer, String> hmap = new HashMap<>();

	      /*Adding elements to HashMap*/
	      hmap.put(1, "Welcome");
	      hmap.put(2, "Contents");
	      hmap.put(3, "Search");
	      hmap.put(4, "Updates");
	      hmap.put(5, "Index");
	      
	      mv.addObject("id", request.getParameter("id"));
	      
	      int mkey= Integer.parseInt(request.getParameter("id"));
	      mv.addObject("desc", hmap.get(mkey));
	      
		mv.setViewName("help");
		return mv;
	}
	
	
	
	
}

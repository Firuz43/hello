package com.firuz.exmp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MasterController {
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView("home");
		return mav;
	}
}

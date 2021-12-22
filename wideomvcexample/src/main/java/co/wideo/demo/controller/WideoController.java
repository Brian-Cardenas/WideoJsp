package co.wideo.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import co.wideo.demo.service.WideoManager;

@Controller
@RequestMapping("/wideo-module")
public class WideoController 
{
	@Autowired
	WideoManager manager;
	
	@RequestMapping(value = "/getAllWideos", method = RequestMethod.GET)
	public String getAllWideos(Model model)
	{
		model.addAttribute("wideos", manager.getAllWideos());
		return "wideosListDisplay";
	}
	
	@RequestMapping(value = "/saveWideo", method = RequestMethod.GET)
	public String saveVideo()
	{
		return "saveWideo";
	}
		
}
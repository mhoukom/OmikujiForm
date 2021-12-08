package com.houkom.omikuji.controllers;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OmikujiController {
	
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}

	@PostMapping("/createfortune")
	public String createFortune(
			@RequestParam("years") Integer years,
			@RequestParam("city") String city,
			@RequestParam("name") String name,
			@RequestParam("profession") String profession,
			@RequestParam("living_thing") String living_thing,
			HttpSession session
			) {
		session.setAttribute("years", years);
		session.setAttribute("city", city);
		session.setAttribute("name", name);
		session.setAttribute("profession", profession);
		session.setAttribute("living_thing", living_thing);
		return "redirect:/showfortune";
	}
	
	@GetMapping("/showfortune")
	public String showFortune() {
		return "showform.jsp";
	}
}

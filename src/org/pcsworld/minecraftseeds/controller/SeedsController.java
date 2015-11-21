package org.pcsworld.minecraftseeds.controller;

import java.util.List;

import javax.validation.Valid;

import org.pcsworld.minecraftseeds.model.Seed;
import org.pcsworld.minecraftseeds.service.SeedsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;




@Controller
public class SeedsController {

	private SeedsService seedsService;

	@Autowired
	public void setSeedsService(SeedsService seedsService) {
		this.seedsService = seedsService;
	}
	
	@RequestMapping("/createseed")
	public String createSeeds(Model model) {
		model.addAttribute("seed", new Seed());
		return "createseed";
	}

	@RequestMapping(value="/docreate", method=RequestMethod.POST)
	public String doCreate(Model model, @Valid Seed seed, BindingResult result) {
		if (result.hasErrors()) {
			return "createseed";
		}
		seedsService.create(seed);
		return "seedcreated";
	}
	@RequestMapping("/seedlist")
	public String showOSeeds(Model model) {
		
		//offersService.throwTestException();
		
		List<Seed> seeds = seedsService.getCurrent();
		
		model.addAttribute("seeds", seeds);
		
		return "seedlist";
	}
	

}

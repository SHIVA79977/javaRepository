package Springbootlayers.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Springbootlayers.Entity.SportsDTO;
import Springbootlayers.Entity.SportsMan;
import Springbootlayers.Srevice.SportsInterface;
import Springbootlayers.Srevice.SportsService;

@RestController
public class SportsController {
	@Autowired
	//@Qualifier("shiva")
	private SportsInterface service;
	@PostMapping("saveSportsMan") 
	public SportsMan callService( @RequestBody SportsDTO man ) {
		
		SportsMan man2= service.saveSportsMan(man);
		 return man2;
	}
	@GetMapping("getbyid/{id}")
	public SportsDTO getbyid(@PathVariable Integer id) {
		return service.saveSportsMan(id);
		
	}
	@GetMapping("getAllSportsMan")
	public List<SportsDTO> getAllSportsMan(){
		return service.getAllSportsMan();
	}
}

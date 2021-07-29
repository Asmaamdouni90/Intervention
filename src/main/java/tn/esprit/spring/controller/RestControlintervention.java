package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.Intervention;
import tn.esprit.spring.service.IInterventionService;

@RestController
public class RestControlintervention{
	@Autowired
	IInterventionService iservice;
	
	@PostMapping("/addIntervention")
	public Intervention ajouterintervention(@RequestBody Intervention i)
	{
		iservice.addIntervention(i);
		return i;
	}
	
	
	 @DeleteMapping("/deleteInterventionById/{id}") 
		@ResponseBody 
		public void deleteInterventionById(@PathVariable("id")int id)
		{
		 iservice.deleteIntervention(id);
		}

	 
	 @GetMapping("/afficherIntervention/{id}")
	public Intervention retrieveIntervention(@PathVariable int id) {
		return iservice.retrieveIntervention(id);
	}

	 
	 @GetMapping("/allInterventions")
	public List<Intervention> retrieveAllIntervention() {
		return iservice.retrieveAllIntervention();
	}

	 @PutMapping( "/modifierIntervention/{id}")
	 	public void update( @RequestBody Intervention i) {
		iservice.update(i);
	}
	 
	 
	 
	 
	 
	
}
package tn.esprit.spring.service;
import java.util.List;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entity.Intervention;

@Service
public interface IInterventionService {
	
	List<Intervention> retrieveAllIntervention();  
	Intervention addIntervention(Intervention i); 
	void deleteIntervention(int id); 
	void update (Intervention i);
	Intervention retrieveIntervention(int id); 

}

package tn.esprit.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tn.esprit.spring.entity.Intervention;
import tn.esprit.spring.repository.InterventionRepository;

@Service

public class InterventionServiceImpl implements IInterventionService {

	private static final Logger l = LogManager.getLogger(InterventionServiceImpl.class);

	@Autowired
   InterventionRepository interrep;
	

	@Override
	public List<Intervention> retrieveAllIntervention() {
		return (List<Intervention>) interrep.findAll();
	}

	@Override
	public Intervention addIntervention(Intervention i) {
	
		return interrep.save(i);
	}

	@Override
	public void deleteIntervention(int id) {
	
		interrep.deleteById(id);
			
	}
	
	

	@Override
	public void update (Intervention i) {
	
			
			  interrep.save(i);

		}



	@Override
	public Intervention retrieveIntervention(int id) {
		return interrep.findById(id).orElse(null);
	}

	

}

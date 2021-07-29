package tn.esprit.spring;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entity.Intervention;
import tn.esprit.spring.service.IInterventionService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InterventionBanqueApplicationTests {
 @Autowired
 IInterventionService InterventionServiceImpl;
	@Test
	 public void contextLoads() {
		
		
	//Intervention i= new Intervention ("message","29:09:1990");
		//InterventionServiceImpl.addIntervention(i);
	//Assert.assertEquals(3, UserServiceImpl.retrieveAllUsers().size());
     	//UserServiceImpl.updateById(1,"asmaaaaaaaa");

	}

}

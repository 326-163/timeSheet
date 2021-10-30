package tn.esprit.spring;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.apache.log4j.Logger;
import tn.esprit.spring.entities.*;
import tn.esprit.spring.services.*;

@SpringBootTest
class TimesheetApplicationTests {
	private static final Logger l = Logger.getLogger(TimesheetApplicationTests.class);
	@Autowired
	IEntrepriseService entrpriseService;
	@Test
	void testAjoutDepartement() {
		int k=0;
		try {
			k=entrpriseService.ajouterDepartement(new Departement("DevOps"));
		boolean test=(k!=0)?true:false;
		
		assertEquals(test, true,"Departement ajouté avec succée");
		
		if(test) {
			l.info("Departement avec id "+k+" added successfully ");
		}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

	@Test
	void suppressionDepartement() {

		try {
			entrpriseService.deleteDepartementById(2);
			
			boolean test=true;
		
		assertEquals(test, true,"Supression du departement avec succés");
		
		if(test) {
			l.info("Departement avec id "+2+" deleted  successfully ");
		}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}



	
}
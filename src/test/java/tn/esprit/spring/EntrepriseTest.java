package tn.esprit.spring;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.repository.EntrepriseRepository;
import tn.esprit.spring.services.EntrepriseServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest

public class EntrepriseTest {
	@Autowired
	EntrepriseServiceImpl es;
	@Autowired 
	EntrepriseRepository entrepriseRepository;
	
	
private static final Logger l = LogManager.getLogger(EntrepriseServiceImpl.class);
	
	@Test
	 public void contextLoads() {
		
	}
	/*@Test
	public void testAjouterEntreprise() {
		 
	
		 int a = es.ajouterEntreprise(new Entreprise("esprit","informatique"));
		 assertThat(a).isGreaterThan(0);
			l.info("idEntreprise: " + a);
	
	}*/
	
	/*@Test
	public void verifIdEntreprise() {
	Entreprise entreprise = es.getEntrepriseById(1);
		System.out.println("****************************");
		assertEquals(2,entreprise.getId());
		
		l.info("id: " + entreprise.getId());
		
	}*/
	/*@Test
    void affecterDepartementAEntreprise() {
    	Departement dept = new Departement("finance");
        es.ajouterDepartement(dept);
        Entreprise entreprise = new Entreprise("testing", "devops");
        es.ajouterEntreprise(entreprise);
        es.affecterDepartementAEntreprise(dept.getId(),entreprise.getId());
        l.info("le departement qui a l'id: " + dept.getId() + " est affecté a l'entreprise avec l'id : " + entreprise.getId());
    }*/
	
	/*@Test
	public void supprimerEntreprise() {
		 es.deleteEntrepriseById(3);
		System.out.println("**************************");
		assertEquals(3,es);
		 
		l.info("id: " + es);
	}*/
	}
	
package com.tutorial.onetoone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.tutorial.onetoone.entity.Carnet;
import com.tutorial.onetoone.entity.Socio;
import com.tutorial.onetoone.repository.CarnetRepository;
import com.tutorial.onetoone.repository.SocioRepository;

@Component
public class MyRunner implements CommandLineRunner {
	
	@Autowired
	SocioRepository socioRepository;
	
	@Autowired
	CarnetRepository carnetRepository;

	@Override
	public void run(String... args) throws Exception {
		/*
		 * Socio pepe = new Socio("pepe"); Socio juan = new Socio("juan"); Carnet cPepe
		 * = new Carnet("1111"); Carnet cJuan = new Carnet("2222");
		 * 
		 * cPepe.setSocio(pepe); cJuan.setSocio(juan);
		 * 
		 * carnetRepository.save(cPepe); carnetRepository.save(cJuan);
		 */
		
		Carnet cPepe = socioRepository.findById(1).get().getCarnet();
		carnetRepository.delete(cPepe);
	}

}

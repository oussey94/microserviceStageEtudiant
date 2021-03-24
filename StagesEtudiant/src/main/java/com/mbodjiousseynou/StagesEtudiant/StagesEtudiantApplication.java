package com.mbodjiousseynou.StagesEtudiant;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.mbodjiousseynou.StagesEtudiant.entities.Stage;
import com.mbodjiousseynou.StagesEtudiant.repository.StageRepository;

@SpringBootApplication
public class StagesEtudiantApplication {

	public static void main(String[] args) {
		SpringApplication.run(StagesEtudiantApplication.class, args);
	}
	@Bean
	CommandLineRunner start(StageRepository stageRepository) {
		return args->{
			stageRepository.save(new Stage(null,"Mbodji","Ousseynou","Atos Senegal"));
			stageRepository.save(new Stage(null,"Mbodji","Fatou","BeAgil"));
			stageRepository.save(new Stage(null,"Diouf","Safietou","Avenir Immo"));
			
			stageRepository.findAll().forEach(s->{
				System.out.println(s.toString());
			});
		};
	}

}

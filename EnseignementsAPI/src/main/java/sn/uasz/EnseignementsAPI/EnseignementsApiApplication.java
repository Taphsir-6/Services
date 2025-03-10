package sn.uasz.EnseignementsAPI;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import sn.uasz.EnseignementsAPI.entities.Enseignant;
import sn.uasz.EnseignementsAPI.repository.EnseignantRepository;

@SpringBootApplication
public class EnseignementsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnseignementsApiApplication.class, args);
	}

	@Bean
	CommandLineRunner start(EnseignantRepository enseignantRepository){
		return args -> {
			enseignantRepository.save(new Enseignant(0,"Mohamed","Ciss","ta.c@zig.univ","7254855","N214","Professeur", null, null));
			enseignantRepository.save(new Enseignant(0,"Abdoulaye","Diop","abdoulaye.d@zig.univ","7354855","N215","Maître", null, null));
			enseignantRepository.save(new Enseignant(0,"Seydou","Ba","seyba@zig.univ","7454855","N216","Docteur", null, null));
			enseignantRepository.save(new Enseignant(0,"Fatou","Sarr","fatou.sarr@zig.univ","7554855","N217","Chercheur", null, null));
		};
	}
}

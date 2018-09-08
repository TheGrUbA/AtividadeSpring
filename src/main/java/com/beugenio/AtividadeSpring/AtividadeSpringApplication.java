package com.beugenio.AtividadeSpring;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.beugenio.AtividadeSpring.domain.Categoria;
import com.beugenio.AtividadeSpring.repositories.CategoriaRepository;

@SpringBootApplication
public class AtividadeSpringApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;
	public static void main(String[] args) {
		SpringApplication.run(AtividadeSpringApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");
 		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
	}
}

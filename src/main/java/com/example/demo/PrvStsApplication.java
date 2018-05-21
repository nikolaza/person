package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrvStsApplication implements CommandLineRunner {

	@Autowired
	PersonRepo tabelata;
	
	public static void main(String[] args) {
		SpringApplication.run(PrvStsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Zdravo");
		Person nikola = new Person ("nikola", "zafirovski", 45);
		Person pepe = new Person ("pepe", "zafirovska", 42);
		tabelata.save(nikola);
		tabelata.save(pepe);
	}
	
	
}

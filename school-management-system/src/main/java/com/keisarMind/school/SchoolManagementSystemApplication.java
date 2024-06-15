package com.keisarMind.school;

import com.keisarMind.school.entity.Student;
import com.keisarMind.school.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SchoolManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SchoolManagementSystemApplication.class, args);
	}

	private final StudentRepository studentRepository;

	@Autowired
	public SchoolManagementSystemApplication(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		/*Student student1 = new Student(null, "Adérito", "Keisar", "akeisar4@gmail.com");
		studentRepository.save(student1);
		Student student2 = new Student(null, "Adelito", "Teca", "ateca@gmail.com");
		studentRepository.save(student2);
		Student student3 = new Student(null, "João", "Keisar", "akeisar4@gmail.com");
		studentRepository.save(student3);*/
	}
}
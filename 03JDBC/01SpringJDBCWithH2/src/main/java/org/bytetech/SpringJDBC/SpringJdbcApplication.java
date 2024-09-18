package org.bytetech.SpringJDBC;

import org.bytetech.SpringJDBC.model.Student;
import org.bytetech.SpringJDBC.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);

		StudentService service = context.getBean(StudentService.class);

		Student s = context.getBean(Student.class);
		s.setId(5);
		s.setName("Aditya");
		s.setMarks(80);

		service.addStudent(s);

		List<Student> students = service.getStudents();
		System.out.println();
		for (Student st : students) {
			System.out.println(st);
		}

		System.out.println();

	}

}

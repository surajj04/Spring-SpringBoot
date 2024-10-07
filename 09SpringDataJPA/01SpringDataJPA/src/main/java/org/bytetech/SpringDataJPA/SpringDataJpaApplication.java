package org.bytetech.SpringDataJPA;

import org.bytetech.SpringDataJPA.model.Student;
import org.bytetech.SpringDataJPA.repo.StudentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);

        StudentRepo repo = context.getBean(StudentRepo.class);


        Student s1 = context.getBean(Student.class);
        s1.setId(1);
        s1.setName("Student 1");
        s1.setMarks(99);

        Student s2 = context.getBean(Student.class);
        s2.setId(2);
        s2.setName("Student 2");
        s2.setMarks(90);

        Student s3 = context.getBean(Student.class);
        s3.setId(3);
        s3.setName("Student 3");
        s3.setMarks(87);

        /*-----	Insert the date into database using the SpringDataJPA  -----*/

//		repo.save(s1);
//		repo.save(s2);
//		repo.save(s3);


        /*-----  Fetching the data from database all data  -----*/

//		List<Student> students = repo.findAll();
//
//		for (Student s : students) {
//			System.out.println(s);
//		}


        /*-----  using findById  -----*/

//        Optional<Student> s = repo.findById(1);
//        System.out.println(s.orElse(new Student()));
//        System.out.println(repo.findById(1));


        /*-----  Query DSL (Domain Specific Language) -----*/

//        List<Student> st1 = repo.findByName("Student 1");
//        System.out.println(st1);

//        List<Student> st2 = repo.findByMarks(87);
//        System.out.println(st2);

//        List<Student> st3 = repo.findByMarksGreaterThan(89);
//        System.out.println(st3);


        /*-----   Update Data   -----*/

//        s3.setId(1);
//        s3.setName("Shreyash");
//        s3.setMarks(97);

//        repo.save(s3);

        /*-----   Delete Data   -----*/

//        repo.deleteById(1);



    }

}

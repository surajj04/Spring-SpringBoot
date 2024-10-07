package org.bytetech.SpringDataJPA.repo;

import org.bytetech.SpringDataJPA.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

//    @Query("SELECT s FROM Student s WHERE s.name = ?1")
    List<Student> findByName(String name);

    List<Student> findByMarks(int i);

    List<Student> findByMarksGreaterThan(int i);
}

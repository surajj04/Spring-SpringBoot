package org.bytetech.SpringJDBC.repo;

import org.bytetech.SpringJDBC.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    private JdbcTemplate jdbc;

    public void save(Student s) {
        String sql = "INSERT INTO student (id,name,marks) VALUES(?,?,?)";
        int row = jdbc.update(sql, s.getId(), s.getName(), s.getMarks());

        System.out.println("No of row's effected : " + row);
    }

    public List<Student> findAll() {
        String sql = "SELECT * FROM student";
//        RowMapper<Student> mapper = (rs, rowNum) -> {
//            Student s = new Student();
//            s.setId(rs.getInt(1));
//            s.setName(rs.getString(2));
//            s.setMarks(rs.getInt(3));
//
//            return s;
//
//        };
        return jdbc.query(sql, (rs, rowNum) -> {
            Student s = new Student();
            s.setId(rs.getInt(1));
            s.setName(rs.getString(2));
            s.setMarks(rs.getInt(3));

            return s;

        });
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }
}

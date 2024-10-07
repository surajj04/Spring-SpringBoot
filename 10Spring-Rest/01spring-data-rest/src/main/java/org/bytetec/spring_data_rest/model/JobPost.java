package org.bytetec.spring_data_rest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class JobPost {
    @Id
    private int id;
    private String title;
    private String location;
    private int exp; // Experience required in years
    private String description;
    private List<String> skills; // List of required skills
    private String company; // Company name
    private String employmentType; // Full-time, part-time, etc.
    private String datePosted; // Date the job was posted
    private String experience; // Experience description



    @Override
    public String toString() {
        return "JobPost{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", location='" + location + '\'' +
                ", exp=" + exp +
                ", description='" + description + '\'' +
                ", skills=" + skills +
                ", company='" + company + '\'' +
                ", employmentType='" + employmentType + '\'' +
                ", datePosted='" + datePosted + '\'' +
                ", experience='" + experience + '\'' +
                '}';
    }
}

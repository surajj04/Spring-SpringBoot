package org.bytetech.SpringRestApi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
@Entity
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

    public JobPost() {
    }

    public JobPost(int id, String title, String location, int exp, String description,
                   List<String> skills, String company, String employmentType,
                   String datePosted, String experience) {
        this.id = id;
        this.title = title;
        this.location = location;
        this.exp = exp;
        this.description = description;
        this.skills = skills;
        this.company = company;
        this.employmentType = employmentType;
        this.datePosted = datePosted;
        this.experience = experience;
    }

    public JobPost(String title, String location, int exp, String description, List<String> skills, String company, String employmentType, String datePosted, String experience) {
        this.title = title;
        this.location = location;
        this.exp = exp;
        this.description = description;
        this.skills = skills;
        this.company = company;
        this.employmentType = employmentType;
        this.datePosted = datePosted;
        this.experience = experience;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }

    public String getDatePosted() {
        return datePosted;
    }

    public void setDatePosted(String datePosted) {
        this.datePosted = datePosted;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

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

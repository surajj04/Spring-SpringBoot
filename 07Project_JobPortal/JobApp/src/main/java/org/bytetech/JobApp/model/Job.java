package org.bytetech.JobApp.model;

public class Job {

    private int id;
    private String title;
    private String location;
    private int exp;
    private String description;

    public Job() {
    }

    public Job(int id, String title, String location, int exp, String description) {
        this.id = id;
        this.title = title;
        this.location = location;
        this.exp = exp;
        this.description = description;
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

    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", location='" + location + '\'' +
                ", exp=" + exp +
                ", description='" + description + '\'' +
                '}';
    }
}

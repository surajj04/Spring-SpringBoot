package org.bytetech.JobApp.repository;

import org.bytetech.JobApp.model.Job;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepositroy {

    private static List<Job> jobs = new ArrayList<>(Arrays.asList(
            new Job(1, "Software Engineer", "New York, NY", 3, "Develop and maintain software applications."),
            new Job(2, "Data Analyst", "San Francisco, CA", 2, "Analyze data and generate insights for business."),
            new Job(3, "Product Manager", "Austin, TX", 5, "Lead product development and manage product lifecycle."),
            new Job(4, "Web Developer", "Remote", 4, "Build and maintain websites and web applications."),
            new Job(5, "DevOps Engineer", "Seattle, WA", 3, "Implement CI/CD pipelines and manage cloud infrastructure.")
    ));

    public List<Job> getJobs() {
        return jobs;
    }

    public Job addJobPost(Job job) {
        jobs.add(job);
        return job;
    }

}

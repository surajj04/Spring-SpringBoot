package org.bytetech.JobApp.service;

import org.bytetech.JobApp.model.Job;
import org.bytetech.JobApp.repository.JobRepositroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobPostService {

    @Autowired
    private JobRepositroy repo;

    public Job addJobPost(Job job) {
        return repo.addJobPost(job);
    }

    public List<Job> getAllJobPost() {
        return repo.getJobs();
    }
}

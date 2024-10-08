package org.bytetech.SpringRestApi.Service;

import org.bytetech.SpringRestApi.Repositroy.JobRepositroy;
import org.bytetech.SpringRestApi.model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobPostService {

    @Autowired
    private JobRepositroy repo;

    public List<JobPost> getAllJobs() {
        return repo.getJobs();
    }

    public JobPost addJob(JobPost job) {
        return repo.addJobPost(job);
    }


    public JobPost getJob(int id) {
        return repo.getJob(id);
    }

    public void updateJob(JobPost post) {
        repo.updateJob(post);
    }

    public String deleteJob(int id) {
        return repo.deleteJob(id);
    }

}

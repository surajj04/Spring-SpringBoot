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
        return repo.findAll();
    }

    public JobPost addJob(JobPost job) {
        return repo.save(job);
    }


    public JobPost getJob(int id) {
        return repo.findById(id).orElse(new JobPost());
    }

    public void updateJob(JobPost post) {
        repo.save(post);
    }

    public String deleteJob(int id) {
        repo.deleteById(id);
        return "Job post deleted successfully.";
    }

    public List<JobPost> search(String title,String description) {
        return repo.findByTitleContainingOrDescriptionContaining(title,description);
    }

}

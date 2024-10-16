package org.bytetech.SpringRestApi.controller;

import org.bytetech.SpringRestApi.Service.JobPostService;
import org.bytetech.SpringRestApi.model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class JobPostController {

    @Autowired
    private JobPostService service;

//    @GetMapping(path = "/jobs",produces = {"applcation/json"})
    @GetMapping("/jobs")
    public List<JobPost> getAllJobPost() {
        return service.getAllJobs();
    }

    @GetMapping("/job/{id}")
    public JobPost getJob(@PathVariable int id) {
        return service.getJob(id);
    }

    @GetMapping("/job/search/{keyword}")
    public List<JobPost> searchByKeyword(@PathVariable String keyword) {
        return service.search(keyword,keyword);
    }

//    @PostMapping(path = "/job",consumes = {"appliaction/xml"})
    @PostMapping("/job")
    public JobPost addJob(@RequestBody JobPost post) {
        return service.addJob(post);
    }

    @PutMapping("/job")
    public JobPost updateJob(@RequestBody JobPost post) {
        service.updateJob(post);
        return service.getJob(post.getId());
    }

    @DeleteMapping("/job/{id}")
    public String deleteJob(@PathVariable int id) {
        String result = service.deleteJob(id);
        return result;
    }



}

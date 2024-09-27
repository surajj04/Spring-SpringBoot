package org.bytetech.JobApp.controller;

import org.bytetech.JobApp.model.Job;
import org.bytetech.JobApp.repository.JobRepositroy;
import org.bytetech.JobApp.service.JobPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class JobsController {

    @Autowired
    private JobPostService service;

    @GetMapping("/jobs")
    public ModelAndView jobs(ModelAndView mv) {
        List<Job> jobs = service.getAllJobPost();

        mv.addObject("jobs", jobs);
        mv.setViewName("viewall");

        return mv;
    }

    @PostMapping("/submitJobPost")
    public ModelAndView addJobs(Job job, ModelAndView mv) {
        Job result = service.addJobPost(job);
        mv.addObject("job", result);
        mv.setViewName("successful");

        return mv;
    }





}

package com.portal.JobPortalApp.controller;

import com.portal.JobPortalApp.model.JobPost;
import com.portal.JobPortalApp.services.JobPortalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("jobPortal")
public class JobPortalController {

    @Autowired
    JobPortalService jobPortalService;


    @GetMapping("load")
    public void load(){
        jobPortalService.load();

    }

    @GetMapping("job/{id}") //return the job based on ID
    public ResponseEntity<JobPost> getJobById(@PathVariable Integer id)
    {
        JobPost j=jobPortalService.getJobByID(id);
        return new ResponseEntity<>(j,HttpStatus.OK);
    }

    @PostMapping("job") // will add the job
    public ResponseEntity<String> addJob(@RequestBody JobPost jobPost){
        jobPortalService.addjobtoportal(jobPost);

        return new ResponseEntity<>("Success",HttpStatus.CREATED);
    }

    @GetMapping("jobs")// Will return list of all the jobs
    public ResponseEntity<List<JobPost>> viewAll(Model model){
        List<JobPost> jobPostList=jobPortalService.getAllJobList();
      
        return new ResponseEntity<>(jobPostList, HttpStatus.OK);
    }

    @DeleteMapping("job/{id}") //delete job based on id
    public ResponseEntity<String> deleteJobByID(@PathVariable Integer id)
    {
        jobPortalService.deleteJobById(id);
       // System.out.println(j);
       return new ResponseEntity<>("Deleted",HttpStatus.NO_CONTENT);
    }

    @PutMapping("job/{id}")
    public ResponseEntity<JobPost> updateJobPost(@PathVariable Integer id, @RequestBody JobPost j){
       JobPost job= jobPortalService.updateJobPost(id,j);
        return new ResponseEntity<>(job,HttpStatus.OK);
    }
}

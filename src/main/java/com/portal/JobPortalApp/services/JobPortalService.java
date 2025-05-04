package com.portal.JobPortalApp.services;

import com.portal.JobPortalApp.model.JobPost;
import com.portal.JobPortalApp.repository.JobPortalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class JobPortalService {

    @Autowired
    JobPortalRepo jobPortalRepo;

    @Autowired
    JobPost jobPost;

    public void addjobtoportal(JobPost jobPost) {

        jobPortalRepo.save(jobPost);
    }

    public List<JobPost> getAllJobList(){

        return jobPortalRepo.findAll();
    }

    public JobPost getJobByID(Integer id) {
        Optional<JobPost> j= jobPortalRepo.findById(id);
       return j.orElse(null);
    }

    public void deleteJobById(Integer id) {
        jobPortalRepo.deleteById(id);

    }

    public JobPost updateJobPost(Integer id, JobPost j) {
         jobPortalRepo.save(j);
        return j;
    }

    public void load()
    {
        List<JobPost> joblist = new ArrayList<>(Arrays.asList(

                new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
                        List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")),


                new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React", 3,
                        List.of("HTML", "CSS", "JavaScript", "React")),


                new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
                        List.of("Python", "Machine Learning", "Data Analysis")),


                new JobPost(4, "Network Engineer", "Design and implement computer networks for efficient data communication", 5,
                        List.of("Networking", "Cisco", "Routing", "Switching")),


                new JobPost(5, "Mobile App Developer", "Experience in mobile app development for iOS and Android", 3,
                        List.of("iOS Development", "Android Development", "Mobile App"))


        ));

        jobPortalRepo.saveAll(joblist);
    }
}

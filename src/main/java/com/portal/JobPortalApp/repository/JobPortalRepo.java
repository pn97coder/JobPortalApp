package com.portal.JobPortalApp.repository;

import com.portal.JobPortalApp.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public interface JobPortalRepo extends JpaRepository<JobPost,Integer> {


//    public void addJob(JobPost jobPost) {
//        joblist.add(jobPost);
//        System.out.println(jobPost);
//    }
//
//    public List<JobPost> getAllJob(){
//
//        return joblist;
//    }
//
//    public JobPost getJobById(Integer id) {
//
//        for(JobPost j:joblist){
//            if(j.getPostId() == id){
//                return j;
//            }
//        }
//        return  null;
//    }
//
//    public JobPost deleteJobById(Integer id) {
//        for(JobPost j:joblist){
//            if(j.getPostId() == id){
//                joblist.remove(j);
//                return j;
//            }
//        }
//        return null;
  //  }

//    public JobPost updateJobPost(Integer id, JobPost j) {
//        for(JobPost job: joblist ){
//             if(job.getPostId() == j.getPostId()){
//                 job.setPostDesc(j.getPostDesc());
//                 //job.setPostProfile(j.getPostProfile());
//                 job.setPostTechStack(j.getPostTechStack());
//                 return job;
//             }
//        }
//        return  null;
//    }
}

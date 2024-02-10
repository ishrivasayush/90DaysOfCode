package com.narainox.firstJobApp.job;



import java.util.List;


public interface JobService {
    List<Job> findAll();
    void createJob(Job job);
    Job findJobBYId(Long id);

    boolean deleteJobByJobId(Long id);

    boolean updateJob(Long id, Job job);
}

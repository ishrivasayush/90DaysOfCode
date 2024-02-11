package com.narainox.firstJobApp.job.impl;

import com.narainox.firstJobApp.job.Job;
import com.narainox.firstJobApp.job.JobRepository;
import com.narainox.firstJobApp.job.JobService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class JobServiceImpl implements JobService {

    private JobRepository jobRepository;

    public JobServiceImpl(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }
    @Override
    public List<Job> findAll() {
        return jobRepository.findAll();
    }

    @Override
    public void createJob(Job job) {
        jobRepository.save(job);
    }

    @Override
    public Job findJobBYId(Long id) {
       return jobRepository.findById(id).orElse(null);
    }

    @Override
    public boolean deleteJobByJobId(Long id) {
        try {
            jobRepository.deleteById(id);
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean updateJob(Long id, Job job) {
        Optional<Job> jobb=jobRepository.findById(id);
        if (jobb.isPresent()){
                jobb.setMaxSalary(job.getMaxSalary());
                jobb.setDescription(job.getDescription());
                jobb.setLocation(job.getLocation());
                jobb.setTitle(job.getTitle());
                jobb.setMinSalary(job.getMinSalary());
                return true;
            }
        else {
            return false;
        }

}


package com.narainox.firstJobApp.job.impl;

import com.narainox.firstJobApp.job.Job;
import com.narainox.firstJobApp.job.JobService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobServiceImpl implements JobService {
    private List<Job> jobs=new ArrayList<>();
    private long jobId=1L;

    @Override
    public List<Job> findAll() {
        return jobs;
    }

    @Override
    public void createJob(Job job) {
        job.setId(jobId++);
        jobs.add(job);
    }

    @Override
    public Job findJobBYId(Long id) {
        for (Job job:jobs)
        {
            if (job.getId()==id)
            {
                return job;
            }
        }
        return null;
    }

    @Override
    public boolean deleteJobByJobId(Long id) {
        for (Job job:jobs)
        {
            if (job.getId()==id)
            {
                jobs.remove(job);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updateJob(Long id, Job job) {
        for (Job jobb:jobs)
        {
            if (jobb.getId()==id)
            {
                jobb.setMaxSalary(job.getMaxSalary());
                jobb.setDescription(job.getDescription());
                jobb.setLocation(job.getLocation());
                jobb.setTitle(job.getTitle());
                jobb.setMinSalary(job.getMinSalary());
                return true;
            }
        }
        return false;
    }
}

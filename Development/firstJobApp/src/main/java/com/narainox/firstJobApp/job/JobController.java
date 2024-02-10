package com.narainox.firstJobApp.job;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobController {
    private JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping
    public ResponseEntity<List<Job>> findAll()
    {
        return ResponseEntity.ok(  jobService.findAll());
    }

    @PostMapping
    public ResponseEntity<String> createJob(@RequestBody Job job)
    {
        jobService.createJob(job);
        return new ResponseEntity<>("Job added Scessfully",HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Job> getJobById(@PathVariable  Long id)
    {
        Job job = jobService.findJobBYId(id);
        return new ResponseEntity<>(job,HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteJobById(@PathVariable  Long id)
    {
        boolean delete=jobService.deleteJobByJobId(id);
        if (delete) {
            return new ResponseEntity<>("Job Deleted Successfully", HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>("Job Not Found",HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public ResponseEntity<String> updateJob(@PathVariable  Long id,@RequestBody Job job)
    {
        Boolean updateJob=jobService.updateJob(id,job);
        if (updateJob) {
            return new ResponseEntity<>("Job Updated Successfully", HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>("Job Not Found",HttpStatus.NOT_FOUND);
        }
    }
}

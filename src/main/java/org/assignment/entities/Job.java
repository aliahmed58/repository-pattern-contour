package org.assignment.entities;

import java.util.Objects;

/**
 * Job entity class
 */
public class Job {

    private int jobId;
    private String jobName;
    private String description;
    private JobType jobType;

    public Job() {}

    public Job(int jobId, String jobName, String description, JobType jobType) {
        this.jobId = jobId;
        this.jobName = jobName;
        this.description = description;
        this.jobType = jobType;
    }

    @Override
    public String toString() {
        return "Job{" +
                "jobId=" + jobId +
                ", jobName='" + jobName + '\'' +
                ", description='" + description + '\'' +
                ", jobType=" + jobType +
                '}';
    }

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public JobType getJobType() {
        return jobType;
    }

    public void setJobType(JobType jobType) {
        this.jobType = jobType;
    }

    /**
     * Equals method to equate job objects on id and its hashcode based on id
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return jobId == job.jobId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId);
    }
}

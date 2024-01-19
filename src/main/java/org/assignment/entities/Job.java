package org.assignment.entities;

/**
 * Job entity class
 */
public class Job extends BaseEntity<Integer> {

    private String jobName;
    private String description;
    private JobType jobType;

    public Job() {}

    public Job(int jobId, String jobName, String description, JobType jobType) {
        super(jobId);
        this.jobName = jobName;
        this.description = description;
        this.jobType = jobType;
    }

    @Override
    public String toString() {
        return "Job{" +
                "jobId=" + id +
                ", jobName='" + jobName + '\'' +
                ", description='" + description + '\'' +
                ", jobType=" + jobType +
                '}';
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

}

package org.assignment.entities;

import java.util.Objects;

public class JobType {

    private int jobTypeId;
    private String type;
    private Level jobLevel;

    public JobType() {}

    public JobType(int jobTypeId, String type, Level jobLevel) {
        this.jobTypeId = jobTypeId;
        this.type = type;
        this.jobLevel = jobLevel;
    }

    @Override
    public String toString() {
        return "JobType{" +
                "jobTypeId='" + jobTypeId + '\'' +
                ", type='" + type + '\'' +
                ", jobLevel=" + jobLevel +
                '}';
    }

    public int getJobTypeId() {
        return jobTypeId;
    }

    public void setJobTypeId(int jobTypeId) {
        this.jobTypeId = jobTypeId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Level getJobLevel() {
        return jobLevel;
    }

    public void setJobLevel(Level jobLevel) {
        this.jobLevel = jobLevel;
    }

    /**
     * Equals method to equate job type objects on JobTypeId
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobType jobType = (JobType) o;
        return jobTypeId == jobType.jobTypeId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobTypeId);
    }
}

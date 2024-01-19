package org.assignment.entities;

public class JobType extends BaseEntity<Integer> {

    private String type;
    private Level jobLevel;

    public JobType() {}

    public JobType(int jobTypeId, String type, Level jobLevel) {
        super(jobTypeId);
        this.type = type;
        this.jobLevel = jobLevel;
    }

    @Override
    public String toString() {
        return "JobType{" +
                "jobTypeId='" + id + '\'' +
                ", type='" + type + '\'' +
                ", jobLevel=" + jobLevel +
                '}';
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

}

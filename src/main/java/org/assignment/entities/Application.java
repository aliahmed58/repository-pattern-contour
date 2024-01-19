package org.assignment.entities;

import java.util.Date;

public class Application extends BaseEntity<Integer> {

    private Applicant applicant;
    private String description;
    private Date dateOfApply;
    private Status applicationStatus;

    public Application(int applicationId, Applicant applicant, String description, Date dateOfApply, Status applicationStatus) {
        super(applicationId);
        this.applicant = applicant;
        this.description = description;
        this.dateOfApply = dateOfApply;
        this.applicationStatus = applicationStatus;
    }
    public Status getApplicationStatus() {
        return applicationStatus;
    }

    public void setApplicationStatus(Status applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    public Application() {
        this.applicationStatus = Status.PENDING;
    }

    public Applicant getApplicant() {
        return applicant;
    }

    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateOfApply() {
        return dateOfApply;
    }

    public void setDateOfApply(Date dateOfApply) {
        this.dateOfApply = dateOfApply;
    }

    @Override
    public String toString() {
        return "Application{" +
                "applicant=" + applicant +
                ", description='" + description + '\'' +
                ", dateOfApply=" + dateOfApply +
                ", applicationStatus=" + applicationStatus +
                ", id=" + id +
                '}';
    }
}

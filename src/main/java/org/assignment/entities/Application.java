package org.assignment.entities;

import java.util.Date;
import java.util.Objects;

public class Application {

    private int applicationId;
    private Applicant applicant;
    private String description;
    private Date dateOfApply;
    private Status applicationStatus;

    public Application(int applicationId, Applicant applicant, String description, Date dateOfApply, Status applicationStatus) {
        this.applicationId = applicationId;
        this.applicant = applicant;
        this.description = description;
        this.dateOfApply = dateOfApply;
        this.applicationStatus = applicationStatus;
    }

    public int getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(int applicationId) {
        this.applicationId = applicationId;
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
                '}';
    }

    /**
     * Equate applications based on applicationId and for the hashcode as well
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Application that = (Application) o;
        return applicationId == that.applicationId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationId);
    }
}

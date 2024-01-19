package org.assignment.repositories;

import org.assignment.entities.*;

import java.util.HashMap;
import java.util.Map;
/**
 * The unit of work class helps in basically doing data changes within memory and committing to database at the end
 * when the transactions (CRUD) have been done. For example inserting, updating in memory then committing to the
 * database. Since we have 5 repositories we can create a map<string, GenericRepsoitory> and then store our repositories
 * in that map and access in O(1) time.
 */
public class UnitOfWork {

    //TODO: create a database context here

    // storing the repositories needed
    GenericRepository<Applicant, String> applicantRepository;
    GenericRepository<Application, Integer> applicationRepository;
    GenericRepository<Job, Integer> jobRepository;
    GenericRepository<JobType, Integer> jobTypeRepository;
    GenericRepository<Recruiter, String> recruiterRepository;

    public void save() {
        // save work after using the repository - equivalent to committing to database
    }

    public GenericRepository<Applicant, String> getApplicantRepository() {
        this.applicantRepository = createIfNull(applicantRepository);
        return this.applicantRepository;
    }

    public GenericRepository<Application, Integer> getApplicationRepository() {
        this.applicationRepository = createIfNull(applicationRepository);
        return this.applicationRepository;
    }

    public GenericRepository<Job, Integer> getJobRepository() {
        this.jobRepository = createIfNull(jobRepository);
        return  this.jobRepository;
    }

    public GenericRepository<JobType, Integer> getJobTypeRepository() {
        this.jobTypeRepository = createIfNull(jobTypeRepository);
        return this.jobTypeRepository;
    }

    public GenericRepository<Recruiter, String> getRecruiterRepository() {
        this.recruiterRepository = createIfNull(recruiterRepository);
        return this.recruiterRepository;
    }

    /**
     * Generic method that checks whether the repository is null and creates or else returns it
     * @param repo the GenericRepository to be checked
     * @return GenericRepository<T, K> objects
     * @param <T> Type of Repo
     * @param <K> Key Type of Repo
     */
    private <T extends BaseEntity<K>, K> GenericRepository<T, K> createIfNull(GenericRepository<T, K> repo) {
        if (repo == null) {
            repo = new GenericRepository<>();
        }
        return repo;
    }
}

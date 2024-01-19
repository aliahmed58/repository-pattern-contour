package org.assignment.repositories;

import org.assignment.entities.Applicant;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

/**
 * The Applicant Repository will have data type of Applicant
 * and the key identifier is String which is Applicant's username
 */
public class ApplicantRepository implements Repository<Applicant, String> {

    /**
     * A hashmap to store the Applicants with key being their username
     */
    private Map<String, Applicant> applicants;

    public ApplicantRepository() {
        this.applicants = new HashMap<>();
    }

    @Override
    public Applicant findById(String id) {
        return this.applicants.getOrDefault(id, null);
    }

    // return ths values of the hashmap containing applicants
    @Override
    public List<Applicant> findAll() {
        return new ArrayList<Applicant>(this.applicants.values());
    }

    // add a new applicant to hashmap
    @Override
    public void add(Applicant entity) throws IllegalArgumentException {
        if (this.applicants.containsKey(entity.getUsername())) {
            throw new IllegalArgumentException("Applicants entity with username " + entity.getUsername() + " already exists");
        } else {
            this.applicants.put(entity.getUsername(), entity);
        }
    }

    @Override
    public void update(Applicant entity) {
        if (!this.applicants.containsKey(entity.getUsername())) {

        }
    }

    @Override
    public void delete(String id) {

    }
}

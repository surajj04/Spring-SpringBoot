package org.bytetec.spring_data_rest.repo;

import org.bytetec.spring_data_rest.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepositroy extends JpaRepository<JobPost, Integer> {

    List<JobPost> findByTitleContainingOrDescriptionContaining(String title, String description);

}
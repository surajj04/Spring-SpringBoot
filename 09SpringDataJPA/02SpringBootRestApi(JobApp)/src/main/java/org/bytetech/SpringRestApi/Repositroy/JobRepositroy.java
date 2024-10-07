package org.bytetech.SpringRestApi.Repositroy;

import org.bytetech.SpringRestApi.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public interface JobRepositroy extends JpaRepository<JobPost, Integer> {

    List<JobPost> findByTitleContainingOrDescriptionContaining(String title,String description);

}
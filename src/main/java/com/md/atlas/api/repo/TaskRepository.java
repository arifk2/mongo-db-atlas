package com.md.atlas.api.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.md.atlas.api.model.Task;

@Repository
public interface TaskRepository extends MongoRepository<Task, String> {

	List<Task> findByPriority(String priority);

	@Query("{ assignee: ?0 }")
    List<Task> getTasksByAssignee(String assignee);
}

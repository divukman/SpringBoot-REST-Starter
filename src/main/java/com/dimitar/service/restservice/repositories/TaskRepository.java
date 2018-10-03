package com.dimitar.service.restservice.repositories;

import com.dimitar.service.restservice.entities.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long> {
}

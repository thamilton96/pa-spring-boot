package uk.ac.belfastmet.todo2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import uk.ac.belfastmet.todo2.domain.ToDo2;
import uk.ac.belfastmet.todo2.repository.TaskRepository;

@Repository
public interface TaskRepository extends CrudRepository<ToDo2, Long>{
}


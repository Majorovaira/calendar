package by.innowise.calendar.repositories;

import by.innowise.calendar.model.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long> {
}

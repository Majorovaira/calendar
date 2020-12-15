package by.innowise.calendar.repositories;


import by.innowise.calendar.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User getUserByName(String name);
    User getUserById(long id);
}

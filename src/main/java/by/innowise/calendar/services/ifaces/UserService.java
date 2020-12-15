package by.innowise.calendar.services.ifaces;


import by.innowise.calendar.model.User;

import java.util.List;

public interface UserService{

   User getUserById(long id);
   User getUserByName(String name);
   User register(User user);
   List<User> getAllUsers();
   void delete(Long id);

}

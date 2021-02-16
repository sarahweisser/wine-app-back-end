package com.weisser.sarah.wineapp.controller;

import com.weisser.sarah.wineapp.util.customException.DuplicateEmailException;
import com.weisser.sarah.wineapp.model.user.User;
import com.weisser.sarah.wineapp.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    // TODO add logging for all methods

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> listUsers() {
        return userRepository.findAll();
    }

    @PostMapping
    public void createUser(@RequestBody User user) throws DuplicateEmailException {
        boolean userEmailExists = (userRepository.findByEmail(user.getEmail()) != null);
        if (userEmailExists) {
            throw new DuplicateEmailException("EMAIL: " + user.getEmail() + " is already in use.");
        } else {
            try {
                // TODO add email validation
                User userTemp2 = userRepository.saveAndFlush(user);
            } catch (Exception e) {
                System.out.println("SERVICE ERROR: " + e.getMessage() + " : " + e.getClass());
            }
        }
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") long id) {
        return userRepository.getOne(id);
    }

    @DeleteMapping("/{id}")
    // TODO add admin restriction
    public void delete(@PathVariable Long id) {
        userRepository.deleteById(id);
    }

    @PutMapping
    public User update(@PathVariable Long id, @RequestBody User user) {
        //TODO: Add validation that all attributes are passed in, otherwise return a 400 bad payload

        User userToUpdate = userRepository.getOne(id);
        BeanUtils.copyProperties(user, userToUpdate, "id");
        return userRepository.saveAndFlush(user);
    }

}

package io.github.palio2012.workshopmongo.services;


import io.github.palio2012.workshopmongo.domain.User;
import io.github.palio2012.workshopmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll () {
        return repository.findAll();
    }
}

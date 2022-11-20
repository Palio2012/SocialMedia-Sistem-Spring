package io.github.palio2012.workshopmongo.services;

import io.github.palio2012.workshopmongo.domain.User;
import io.github.palio2012.workshopmongo.dto.UserDTO;
import io.github.palio2012.workshopmongo.repository.UserRepository;
import io.github.palio2012.workshopmongo.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }

    public User findById(String id) {
        Optional<User> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }

    public User insert(User obj) {
        return repo.insert(obj);
    }

    public void delete (String id) {
        findById(id);
        repo.deleteById(id);
    }

    public User update (User obj) {
        User newobj = repo.findById(obj.getId()).orElseThrow(() -> new ObjectNotFoundException("Object not found"));
        updateData(newobj, obj);
        return repo.save(newobj);
    }

    private void updateData(User newobj, User obj) {
        newobj.setName(obj.getName());
        newobj.setEmail(obj.getEmail());
    }

    public User fromDTO(UserDTO objDto) {
        return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
    }
}
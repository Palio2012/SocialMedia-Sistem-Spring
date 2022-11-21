package io.github.palio2012.workshopmongo.services;

import io.github.palio2012.workshopmongo.domain.Post;
import io.github.palio2012.workshopmongo.repository.PostRepository;
import io.github.palio2012.workshopmongo.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public List<Post> findAll() {
        return repo.findAll();
    }

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }

    public List <Post> findByTitle (String text) {
        return repo.searchTitle(text);
    }
}


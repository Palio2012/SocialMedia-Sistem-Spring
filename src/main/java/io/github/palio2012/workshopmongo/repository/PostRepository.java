package io.github.palio2012.workshopmongo.repository;


import io.github.palio2012.workshopmongo.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PostRepository extends MongoRepository <Post, String> {
}

package io.github.palio2012.workshopmongo.repository;


import io.github.palio2012.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UserRepository extends MongoRepository <User, String> {

}

package com.exercisetracker.exercise.repositories;

import com.exercisetracker.exercise.domain.User;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
    List<User> findAll();
}

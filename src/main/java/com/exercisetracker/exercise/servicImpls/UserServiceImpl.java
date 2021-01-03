package com.exercisetracker.exercise.servicImpls;

import com.exercisetracker.exercise.DTOs.UserDTO;
import com.exercisetracker.exercise.domain.User;
import com.exercisetracker.exercise.mappers.DTOMapper;
import com.exercisetracker.exercise.repositories.UserRepository;
import com.exercisetracker.exercise.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private DTOMapper mapper;

    public UserServiceImpl(UserRepository userRepository, DTOMapper mapper) {
        this.userRepository = userRepository;
        this.mapper = mapper;
    }

@Override
    public UserDTO addUser(UserDTO userDTO) {
    User saveUser = userRepository.save(mapper.mapToEntity(userDTO));
    return mapper.mapToDto(saveUser);
}
}

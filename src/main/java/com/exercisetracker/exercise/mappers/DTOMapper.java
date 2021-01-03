package com.exercisetracker.exercise.mappers;

import com.exercisetracker.exercise.DTOs.UserDTO;
import com.exercisetracker.exercise.domain.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValueCheckStrategy;

@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface DTOMapper {

    UserDTO mapToDto(User user);
    User mapToEntity(UserDTO userDTO);
}

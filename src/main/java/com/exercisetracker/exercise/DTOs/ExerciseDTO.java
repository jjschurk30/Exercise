package com.exercisetracker.exercise.DTOs;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class ExerciseDTO {

    private List<UserDTO> user;

    private String description;

    private String duration;

    private LocalDate date;


}

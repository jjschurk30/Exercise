package com.exercisetracker.exercise.domain;

import com.exercisetracker.exercise.DTOs.UserDTO;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class Exercise {

    private List<UserDTO> userId;

    private String description;

    private String duration;

    private LocalDate date;

}

package com.api.todolist.domain.task;

import jakarta.validation.constraints.NotBlank;

public record TaskRequestDTO(
        @NotBlank(message = "O título não pode ser nulo ou vazio.")
        String title,
        @NotBlank(message = "A descrição não pode ser nula ou vazia.")
        String description
) {
}

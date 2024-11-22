package ru.als.app.dto;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {
}

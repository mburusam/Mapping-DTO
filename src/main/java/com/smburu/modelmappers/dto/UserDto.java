package com.smburu.modelmappers.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private Long id;
    @NotEmpty(message = "User first name should not be null or empty")
    private String firstName;
    @NotEmpty(message = "User Last name should not be null or empty")
    private String lastName;
    @NotEmpty(message = "User email should not be null or empty")
    @Email(message = "Email address should be valid")
    private String email;
}

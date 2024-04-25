package com.clearsolution.testAssignment.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class User {

    private long id;

    @Email
    private String email;

    @NotEmpty(message = "First name shouldn't be null or empty")
    private String firstName;

    @NotEmpty(message = "Last name shouldn't be null or empty")
    private String lastName;

    @Pattern(regexp = "[1-9][0-9][0-9]{2}-([0][1-9]|[1][0-2])-([1-2][0-9]|[0][1-9]|[3][0-1])", message = "Birth date must have format: yyyy-mm-dd")
    private String birthDate;

    private String address;

    private String phoneNumber;

}

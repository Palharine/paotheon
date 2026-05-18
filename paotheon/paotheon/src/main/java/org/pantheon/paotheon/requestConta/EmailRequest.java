package org.pantheon.paotheon.requestConta;

import jakarta.validation.constraints.Email;
import lombok.Data;
import jakarta.validation.constraints.NotBlank;

@Data
public class EmailRequest{

    @NotBlank(message="Email is requested")
    @Email
    private String email;
}

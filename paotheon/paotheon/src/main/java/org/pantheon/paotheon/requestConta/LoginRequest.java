package org.pantheon.paotheon.requestConta;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginRequest{
    @NotBlank(message = "Needs email")
    @Email(message = "email format isn't apropried")
    protected String email;
    
    @NotBlank(message = "Needs password")
    protected String password;
}

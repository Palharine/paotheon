package org.pantheon.paotheon.requestConta;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class ResetPasswordRequest{
 
    @NotBlank(message = "Token is required")
    private String token;
    
    @NotBlank
    @Size(min = 6, message = "Needs new password with at least 6 characters")
    private String newPassword;
}

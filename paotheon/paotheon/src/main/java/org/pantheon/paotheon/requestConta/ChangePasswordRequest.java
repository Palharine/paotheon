package org.pantheon.paotheon.requestConta;

import lombok.Data;
import jakarta.validation.constraints.NotBlank;

@Data
public class ChangePasswordRequest{
    
    @NotBlank(message = "Current password is required")
    private String currentPassword;
    
    @NotBlank(message = "Needs new password")
    private String newPassword;
}

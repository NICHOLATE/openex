package backend.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterRequest {

    private String firstName;

    private String lastName;

    private String email;

    private String phoneNumber;

    private String jobType;

    private String hobbies;

    private String employmentStatus;

    private String incomeType;

    private String password;

    private String confirmPassword;
}
package backend.controller;

import backend.model.User;
import backend.repository.UserRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.crypto.password.PasswordEncoder;
import backend.dto.RegisterRequest;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserController(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @PostMapping
    public User createUser(@RequestBody RegisterRequest request) {

        User user = new User();

        user.setName(request.getFirstName());
        user.setSurname(request.getLastName());
        user.setEmail(request.getEmail());

        // hash password
        String hashedPassword = passwordEncoder.encode(request.getPassword());
        user.setPassword(hashedPassword);

        return userRepository.save(user);
    }
}
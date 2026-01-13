package com.ahs.urbanliving.service;


import com.ahs.urbanliving.domain.User;
import com.ahs.urbanliving.dto.CreateUserRequest;
import com.ahs.urbanliving.dto.UserResponse;
import com.ahs.urbanliving.exception.DuplicateEmailException;
import com.ahs.urbanliving.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder){
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public UserResponse createUser(CreateUserRequest request){

        if(userRepository.existsByEmail(request.getEmail())){
            throw new DuplicateEmailException(request.getEmail());
        }

        String hashedPassword = passwordEncoder.encode(request.getPassword());

        User user = new User(
                request.getFullName(),
                request.getEmail(),
                hashedPassword,
                request.getRoles()
        );

        User savedUser = userRepository.save(user);

        return UserResponse.from(savedUser);
    }

}

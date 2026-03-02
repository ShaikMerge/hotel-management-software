package org.atlas.hotelbookingsoftware.service;

import lombok.RequiredArgsConstructor;
import org.atlas.hotelbookingsoftware.entity.User;
import org.atlas.hotelbookingsoftware.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User createUser(User user) {
        User createdUser = new User();
        createdUser.setUserName(user.getUserName());
        createdUser.setEmail(user.getEmail());
        return userRepository.save(createdUser);
    }
}

package org.epolivtsev.weather.service;

import lombok.AllArgsConstructor;
import org.epolivtsev.weather.persistence.entity.UserEntity;
import org.epolivtsev.weather.persistence.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public UserEntity findUserById(Long userId) {
        return userRepository.findByUserId(userId);
    }
}

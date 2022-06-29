package org.epolivtsev.weather.persistence.repository;

import org.epolivtsev.weather.persistence.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findByUserId(Long userId);
}

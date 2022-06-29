package org.epolivtsev.weather.persistence.repository;

import org.epolivtsev.weather.persistence.entity.LogEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogRepository extends JpaRepository<LogEntity, Long> {
}

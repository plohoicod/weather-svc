package org.epolivtsev.weather.service;

import lombok.AllArgsConstructor;
import org.epolivtsev.weather.persistence.entity.LogEntity;
import org.epolivtsev.weather.persistence.repository.LogRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class LogService {
    private final LogRepository logRepository;

    public void save(LogEntity entity) {
        logRepository.save(entity);
    }
}

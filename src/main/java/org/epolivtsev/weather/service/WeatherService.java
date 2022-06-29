package org.epolivtsev.weather.service;

import lombok.AllArgsConstructor;
import org.epolivtsev.weather.controller.request.GetWeatherRequestDto;
import org.epolivtsev.weather.controller.response.GetWeatherResponseDto;
import org.epolivtsev.weather.persistence.entity.LogEntity;
import org.epolivtsev.weather.persistence.entity.UserEntity;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class WeatherService {
    private final UserService userService;
    private final LogService logService;
    private final RealmeteoService realmeteoService;

    public GetWeatherResponseDto getWeather(GetWeatherRequestDto dto) {
        LogEntity logEntity = new LogEntity();
        logEntity.setUserId(dto.getUserId());

        UserEntity user = userService.findUserById(dto.getUserId());

        if (user == null) {
            logEntity.setRequestResult("Пользователь не найден в БД");
            logService.save(logEntity);
            return new GetWeatherResponseDto("Пользователь не найден в БД");
        }
        if (user.getCity() == null) {
            logEntity.setRequestResult("У пользователя не указан город");
            logService.save(logEntity);
            return new GetWeatherResponseDto("У пользователя не указан город");
        }

        String requestResult = realmeteoService.getTemperatureByCity(user.getCity());
        logEntity.setRequestResult(requestResult);
        logService.save(logEntity);
        return new GetWeatherResponseDto(requestResult);

    }
}

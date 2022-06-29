package org.epolivtsev.weather.controller;

import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.epolivtsev.weather.controller.request.GetWeatherRequestDto;
import org.epolivtsev.weather.controller.response.GetWeatherResponseDto;
import org.epolivtsev.weather.service.WeatherService;
import org.springdoc.api.annotations.ParameterObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/weather")
public class WeatherController {
    private final WeatherService weatherService;

    @GetMapping("/get")
    @Operation(summary = "Получение текущей температуры по id пользователя")
    public GetWeatherResponseDto getWeatherByUserId(@ParameterObject GetWeatherRequestDto dto) {
        return weatherService.getWeather(dto);
    }
}

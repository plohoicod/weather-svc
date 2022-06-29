package org.epolivtsev.weather.controller.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GetWeatherResponseDto {
    private String weather;
}

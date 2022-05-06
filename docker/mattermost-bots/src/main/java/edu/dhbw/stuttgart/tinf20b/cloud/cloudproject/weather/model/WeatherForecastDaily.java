package edu.dhbw.stuttgart.tinf20b.cloud.cloudproject.weather.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class WeatherForecastDaily {

    private long dt;
    private WeatherForecastDailyTemp temp;
    private double pressure;
    private double humidity;
    private double dew_point;
    private double wind_speed;
    private double wind_deg;
    private double wind_gust;
    private List<WeatherForecastDailyWeather> weather;
    private double clouds;
    private double pop;
    private double uvi;

}

package edu.dhbw.stuttgart.tinf20b.cloud.cloudproject.weather.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class WeatherForecastDailyTemp {

    private double day;
    private double min;
    private double max;
    private double night;
    private double eve;
    private double morn;

}

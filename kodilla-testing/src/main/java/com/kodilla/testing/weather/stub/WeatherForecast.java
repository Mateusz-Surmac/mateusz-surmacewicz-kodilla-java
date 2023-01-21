package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }
    public double averageTemperature() {
        List<Double> resultMap = new ArrayList<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            resultMap.add(temperature.getValue());
        }
        double result = 0;
        for (Double temperature : resultMap) {
            result = result + temperature;
        }
        result = result / resultMap.size();

        return result;
    }

    public double medianTemperature() {
        List<Double> resultMap = new ArrayList<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            resultMap.add(temperature.getValue());
        }
        Collections.sort(resultMap);
        double result = 0;
        if (resultMap.size() % 2 == 1) {
            result = resultMap.get(resultMap.size() / 2);
        } else if (resultMap.size() % 2 == 0) {
            result = (resultMap.get(resultMap.size()/2) + resultMap.get(resultMap.size()/2)-1)/2;
        }

        return result;
    }
}
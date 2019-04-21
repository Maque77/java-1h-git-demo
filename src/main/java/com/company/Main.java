package com.company;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper obj = new ObjectMapper();
        Car c = new Car("Opel", "Omega");
        String car = obj.writeValueAsString(c);
        System.out.println(car);

        String jsonCar = "{\"brand\":\"Hyundai\",\"model\":\"Elantra i35\"}";
        Car carFromJson = obj.readValue(jsonCar, Car.class);
        System.out.println(carFromJson);
        Stream s;
    }
}

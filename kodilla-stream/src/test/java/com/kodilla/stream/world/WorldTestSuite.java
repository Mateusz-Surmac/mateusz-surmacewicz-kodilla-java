package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        World world = new World();

        Continent europe = new Continent();
        Continent asia = new Continent();
        Continent africa = new Continent();
        Continent america = new Continent();
        Continent atlantis = new Continent();

        //When
        europe.addCountry(new Country(new BigDecimal("4354563567"), "Monako"));
        europe.addCountry(new Country(new BigDecimal("5458963412"), "Sam Marino"));
        europe.addCountry(new Country(new BigDecimal("9855242523"), "Andorra"));
        asia.addCountry(new Country(new BigDecimal("51561651"), "Bangladesh"));
        asia.addCountry(new Country(new BigDecimal("151541515"), "Nepal"));
        asia.addCountry(new Country(new BigDecimal("5519165"), "Bhutan"));
        africa.addCountry(new Country(new BigDecimal("5191911"), "Rwanda"));
        africa.addCountry(new Country(new BigDecimal("199195515"), "Burundi"));
        africa.addCountry(new Country(new BigDecimal("29195191"), "Zimbabwe"));
        america.addCountry(new Country(new BigDecimal("51541541115"), "USA"));
        america.addCountry(new Country(new BigDecimal("1655191118"), "Cuba"));
        atlantis.addCountry(new Country(new BigDecimal("1"), "Atlantis"));

        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(africa);
        world.addContinent(america);
        world.addContinent(atlantis);

        BigDecimal quantity = world.getPeopleQuantity();
        BigDecimal expectedQuantity = new BigDecimal("73307706684");

        //Then
        Assertions.assertEquals(expectedQuantity, quantity);
    }
}
package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {
    @Test
    void getLastLog() {
        //Given
        Logger logger = Logger.LOGGER;
        logger.log("Logged in");

        //When
        String lastLog = logger.getLastLog();

        //Then
        Assertions.assertEquals("Logged in", lastLog);
    }
}

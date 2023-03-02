package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        Millenials millenials = new Millenials("John");
        YGeneration yGeneration = new YGeneration("Johnas");
        ZGeneration zGeneration = new ZGeneration("Jonathan");

        //When & Then
        Assertions.assertEquals("Facebook",millenials.sharePost());
        Assertions.assertEquals("Snapchat",yGeneration.sharePost());
        Assertions.assertEquals("Twitter",zGeneration.sharePost());
    }
    @Test
    public void testIndividualSharingStrategy() {

        //Given
        User millennials = new Millenials("Janusz");
        millennials.setSocialPublisher(new TwitterPublisher());

        //When&Then
        Assertions.assertEquals("Twitter", millennials.sharePost());
    }
}

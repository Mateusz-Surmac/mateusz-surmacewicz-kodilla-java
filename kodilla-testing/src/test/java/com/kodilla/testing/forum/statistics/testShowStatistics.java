package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testShowStatistics {
    private static int testCounter = 0;
    @BeforeEach
    public void beforeEveryTest() {
    testCounter++;
    System.out.println("Test nr : " + testCounter);
    }
    @Test
    void noPosts() {
        //Given
        ShowStatistics x = new ShowStatistics(0,1,1);

        //Then
        Assertions.assertEquals(0, x.postsCount());
    }
    @Test
    void thousandPosts() {
        //Given
        ShowStatistics x = new ShowStatistics(1000,1,1);

        //Then
        Assertions.assertEquals(1000, x.postsCount());
    }
    @Test
    void noComments() {
        //Given
        ShowStatistics x = new ShowStatistics(1000,0,1);

        //Then
        Assertions.assertEquals(0, x.commentsCount());
    }
    @Test
    void moreCommentsThanPosts() {
        //Given
        ShowStatistics x = new ShowStatistics(0,1000,0);

        //Then
        Assertions.assertTrue(x.postsCount() < x.commentsCount());
    }
    @Test
    void morePostsThanComments() {
        //Given
        ShowStatistics x = new ShowStatistics(1000,100,1);

        //Then
        Assertions.assertTrue(x.commentsCount() < x.postsCount());
    }
    @Test
    void noUsers() {
        //Given
        ShowStatistics x = new ShowStatistics(0,1,0);

        //Then
        Assertions.assertEquals(0, x.numberOfUsers());
    }
    @Test
    void thousandUsers() {
        //Given
        ShowStatistics x = new ShowStatistics(1000,1,1000);
        for (int q = 0; q < 1000; q++) {
            x.addUser("qsad");
        }

        //Then
        Assertions.assertEquals(1000, x.numberOfUsers());
    }


}

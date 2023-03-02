package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskFactoryTestSuite {
    @Test
    void testShoppingTask() {
        //Given
        TasksFactory taskFactory = new TasksFactory();
        //When
        Task shopping = taskFactory.makeTask(TasksFactory.SHOPPING);
        //Then
        Assertions.assertEquals("GunShop", shopping.getTaskName());
        Assertions.assertFalse(shopping.isTaskExecuted());
    }
    @Test
    void testPaintingTask() {
        //Given
        TasksFactory taskFactory = new TasksFactory();
        //When
        Task painting = taskFactory.makeTask(TasksFactory.PAINTING);
        boolean beforeExecution = painting.isTaskExecuted();
        painting.executeTask();
        //Then
        Assertions.assertEquals("Austrian painter", painting.getTaskName());
        Assertions.assertFalse(beforeExecution);
        Assertions.assertTrue(painting.isTaskExecuted());
    }
    @Test
    void testDrivingTask() {
        //Given
        TasksFactory taskFactory = new TasksFactory();
        //When
        Task driving = taskFactory.makeTask(TasksFactory.DRIVING);
        //Then
        Assertions.assertEquals("Natural Driving", driving.getTaskName());
        Assertions.assertFalse(driving.isTaskExecuted());
    }
}

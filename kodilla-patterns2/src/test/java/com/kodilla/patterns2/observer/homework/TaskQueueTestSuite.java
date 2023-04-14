package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskQueueTestSuite {
    @Test
    void countTaskQueues() {
        //Given
        TasksQueue tasksQueue1 = new TasksQueue("Jan Karol Chodkiewicz");
        TasksQueue tasksQueue2 = new TasksQueue("Stanislaw Zolkiewski");
        TasksQueue tasksQueue3 = new TasksQueue("Stanislaw Koniecpolski");
        TasksQueue tasksQueue4 = new TasksQueue("Stefan Czarniecki");

        TaskObserver taskObserver1 = new Mentor("Jozef Wodzinski");
        TaskObserver taskObserver2 = new Mentor("Filip Ordutowski");
        TaskObserver taskObserver3 = new Mentor("John Lind");

        //When
        tasksQueue1.registerMentor(taskObserver2,tasksQueue1);
        tasksQueue2.registerMentor(taskObserver2,tasksQueue2);
        tasksQueue3.registerMentor(taskObserver3,tasksQueue3);
        tasksQueue4.registerMentor(taskObserver3,tasksQueue4);

        //Then

        assertEquals(2,taskObserver2.countQueues());
        assertEquals(0,taskObserver1.countQueues());
        assertEquals(2,taskObserver3.countQueues());

    }
}

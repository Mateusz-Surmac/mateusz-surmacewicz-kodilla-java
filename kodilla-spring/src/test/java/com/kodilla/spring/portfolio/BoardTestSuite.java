package com.kodilla.spring.portfolio;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().addTask("veni");
        board.getInProgressList().addTask("vidi");
        board.getDoneList().addTask("vici");

        //Then
        Assertions.assertEquals("veni", board.getToDoList().getTasks().get(0));
        Assertions.assertEquals("vidi", board.getInProgressList().getTasks().get(0));
        Assertions.assertEquals("vici", board.getDoneList().getTasks().get(0));
    }
}


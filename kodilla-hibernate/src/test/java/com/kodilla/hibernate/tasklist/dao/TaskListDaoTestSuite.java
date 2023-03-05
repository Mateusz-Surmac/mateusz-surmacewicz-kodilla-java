package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.takslist.TaskList;
import com.kodilla.hibernate.takslist.dao.TaskListDao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private final static String LISTNAME = "ShoppingList";
    private final static String DESCRIPTION = "Flour";
    @Test
    void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(LISTNAME,DESCRIPTION);
        taskListDao.save(taskList);
        String listNameCheck = taskList.getListName();

        //When
        List<TaskList> readTasksList = taskListDao.findByListName(listNameCheck);

        //Then
        Assertions.assertEquals(1,readTasksList.size());

        //CleanUp
        int id = readTasksList.get(0).getId();
        taskListDao.deleteById(id);
    }
}

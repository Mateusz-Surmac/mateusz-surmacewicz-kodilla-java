package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Mentor implements TaskObserver{
    private final String name;
    private final List<TasksQueue> tasksQueueList;
    private int queuesQty;

    public Mentor(String name) {
        tasksQueueList = new ArrayList<>();
        this.name = name;
    }

    @Override
    public String acceptTask(Task task) {
        return "Task - " + task.getName() + " changed status : ACCEPTED ";
    }

    @Override
    public String writeComment(Task task) {
        return "New comment : " + task.getName();
    }

    @Override
    public void addQueue(TasksQueue tasksQueue) {
        tasksQueueList.add(tasksQueue);
    }

    @Override
    public int countQueues() {
        return tasksQueueList.size();
    }

    public String getName() {
        return name;
    }

    public List<TasksQueue> getTasksQueueList() {
        return tasksQueueList;
    }

    public int getQueuesQty() {
        return queuesQty;
    }
}

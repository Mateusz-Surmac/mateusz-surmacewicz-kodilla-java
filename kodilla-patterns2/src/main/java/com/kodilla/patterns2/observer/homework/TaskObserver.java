package com.kodilla.patterns2.observer.homework;

public interface TaskObserver {
    String acceptTask(Task task);
    String writeComment(Task task);
    void addQueue(TasksQueue tasksQueue);
    int countQueues();

}

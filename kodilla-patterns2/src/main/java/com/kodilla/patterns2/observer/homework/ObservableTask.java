package com.kodilla.patterns2.observer.homework;

public interface ObservableTask {
    void addTask(Task task);
    void registerMentor(TaskObserver taskObserver, TasksQueue tasksQueue);
    void removeMentor(TaskObserver taskObserver);
}

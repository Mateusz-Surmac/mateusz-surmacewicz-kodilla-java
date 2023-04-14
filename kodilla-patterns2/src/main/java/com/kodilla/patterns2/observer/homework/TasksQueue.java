package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class TasksQueue implements ObservableTask{
    private final List<Task> taskList;
    private final List<TaskObserver> taskObserverList;
    private final String studentName;

    public TasksQueue(String studentName) {
        taskList = new ArrayList<>();
        taskObserverList = new ArrayList<>();
        this.studentName = studentName;
    }
    @Override
    public void addTask(Task task) {
        taskList.add(task);

    }

    @Override
    public void registerMentor(TaskObserver taskObserver, TasksQueue tasksQueue) {
            taskObserverList.add(taskObserver);
            taskObserver.addQueue(tasksQueue);
    }

    @Override
    public void removeMentor(TaskObserver taskObserver) {
        taskObserverList.remove(taskObserver);
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    public List<TaskObserver> getTaskObserverList() {
        return taskObserverList;
    }

    public String getStudentName() {
        return studentName;
    }
}

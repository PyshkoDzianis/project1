package by.grodno.denis.service;

import by.grodno.denis.model.task.Task;

public interface Scheduler {
    void runTask(Task task);
}


package by.grodno.denis.model.user;

import by.grodno.denis.model.task.Task;

import java.util.List;

public interface User<T> {
    T getId();
    void setId(T id);
    String getName();
    int getAge();
    List<Task> getTasks();
    void addTask(Task task);
}

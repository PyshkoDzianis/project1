package by.grodno.denis.model.user;

import by.grodno.denis.model.task.Task;

import java.util.List;

abstract class UserBase<T> implements User<T> {
    private final List<Task> tasks = getDefaultTasks();

    abstract List<Task> getDefaultTasks();

    @Override
    public void addTask(Task task) {
        tasks.add(task);
    }

    @Override
    public List<Task> getTasks() {
        return tasks;
    }
}

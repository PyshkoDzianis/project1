package by.grodno.denis.model.task;

public interface Task {
    int getId();
    String getName();
    Category getCategory();
    Priority getPriority();
    String getDate();
}

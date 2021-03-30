package by.grodno.denis.model.user;

import by.grodno.denis.model.task.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Teacher extends UserBase<Long> {
    private final Random random = new Random();
    final String name;
    final int age;
    private Long id = random.nextLong();

    public Teacher(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    List<Task> getDefaultTasks() {
        List<Task> defaultTasks = new ArrayList<>();
        defaultTasks.add(new ReoccurredTask(Category.Optional, Priority.Low, "Prepare for the lesson"));
        defaultTasks.add(new ReoccurredTask(Category.Mandatory, Priority.High, "Go to the lesson"));
        defaultTasks.add(new OneTimeTask(Category.Mandatory, Priority.High, "Take an exam from students"));
        return defaultTasks;
    }
}

package by.grodno.denis.model.user;

import by.grodno.denis.model.task.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class Student extends UserBase<Integer> {
    private final String name;
    private final int age;
    private final Random random = new Random();
    private int id = random.nextInt();

    private Student(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
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
        defaultTasks.add(new ReoccurredTask(Category.Mandatory, Priority.High, "Complete HW"));
        defaultTasks.add(new ReoccurredTask(Category.Mandatory, Priority.High, "Go to the lesson"));
        defaultTasks.add(new OneTimeTask(Category.Optional, Priority.Normal, "Take a party and celebrate!"));
        return defaultTasks;
    }

    public static class Builder {
        private String name = "";
        private int age = 0;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
}


package by.grodno.denis.app;

import by.grodno.denis.model.task.Category;
import by.grodno.denis.model.task.OneTimeTask;
import by.grodno.denis.model.task.Priority;
import by.grodno.denis.model.user.Student;
import by.grodno.denis.model.user.Teacher;
import by.grodno.denis.model.user.User;
import by.grodno.denis.service.LearnScheduler;
import by.grodno.denis.service.Scheduler;

public class Main {
    public static void main(String[] args) {
        Student.Builder studentBuilder = new Student.Builder();
        User<Integer> student = studentBuilder
                .setAge(10)
                .setName("Denis")
                .build();

        student.addTask(new OneTimeTask(Category.Mandatory, Priority.Normal, "Wash the desc"));

        User<Long> teacher = new Teacher("Julja", 20);

        Scheduler scheduler = new LearnScheduler();

        System.out.println("Run tasks for " + teacher.getName());
        teacher.getTasks().forEach(scheduler::runTask);
        System.out.println("Run tasks for " + student.getName());
        student.getTasks().forEach(scheduler::runTask);
    }
}
package by.grodno.denis.service;

import by.grodno.denis.model.task.Task;

public class LearnScheduler implements Scheduler {

    @Override
    public void runTask(Task task) {
        System.out.println("Starting task " + task.getId() + " " + task.getName());
        work();
        System.out.println("Task finished: " + task.getId() + " " + task.getName());
    }

    private void work() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

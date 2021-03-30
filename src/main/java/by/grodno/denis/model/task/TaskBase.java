package by.grodno.denis.model.task;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

abstract class TaskBase implements Task {
    final Random random = new Random();
    final SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    final String created = dateFormat.format(new Date());

    @Override
    public int getId() {
        return random.nextInt();
    }

    @Override
    public String getDate() {
        return created;
    }
}
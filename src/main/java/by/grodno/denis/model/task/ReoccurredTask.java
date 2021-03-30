
package by.grodno.denis.model.task;

public class ReoccurredTask extends TaskBase {
    final Category category;
    final Priority priority;
    final String name;

    public ReoccurredTask(Category category, Priority priority, String name) {
        this.category = category;
        this.priority = priority;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Category getCategory() {
        return category;
    }

    @Override
    public Priority getPriority() {
        return priority;
    }
}

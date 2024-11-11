package src.task.domain;

import src.task.enums.TaskStatus;

public class Status {
    final protected TaskStatus value;

    public Status(TaskStatus value) {
        this.value = value;
    }

    public String value() {
        return this.value.value();
    }
}
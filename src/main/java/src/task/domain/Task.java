package src.task.domain;

import src.shared.domain.CreatedAt;
import src.shared.domain.UpdatedAt;

import java.util.Date;

public class Task {

    private final Id id;
    private final Description description;
    private final Status status;
    private final CreatedAt createdAt;
    private final UpdatedAt updatedAt;

    public Task(Id id, Description description, Status status, CreatedAt createdAt, UpdatedAt updatedAt) {
        this.id = id;
        this.description = description;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Number getId() {
        return id.value();
    }

    public String getDescription() {
        return description.value();
    }

    public String getStatus() {
        return status.value();
    }

    public Date getCreatedAt() {
        return createdAt.value();
    }

    public Date getUpdatedAt() {
        return updatedAt.value();
    }

    public Task updateDescription(Description description) {
        return new Task(this.id, description, this.status, this.createdAt, new UpdatedAt(new Date()));
    }

    public Task updateStatus(Status status) {
        return new Task(this.id, this.description, status, this.createdAt, new UpdatedAt(new Date()));
    }
}

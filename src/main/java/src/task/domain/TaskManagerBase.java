package src.task.domain;

import java.util.ArrayList;

public interface TaskManagerBase {
    public void add(Task task);
    public void update(Task task);
    public void delete(Task task);
    public ArrayList<Task> listAll();
    public ArrayList<Task> listByStatus(Status status);
}

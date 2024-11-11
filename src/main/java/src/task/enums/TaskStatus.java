package src.task.enums;

public enum TaskStatus {
    TO_DO("to do"),
    IN_PROGRESS("in progress"),
    DONE("done");

    private final String value;

    TaskStatus(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}
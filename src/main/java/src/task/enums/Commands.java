package src.task.enums;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public enum Commands {
    ADD("add"),
    UPDATE("update"),
    DELETE("delete"),
    MARK_IN_PROGRESS("mark-in-progress"),
    MARK_DONE("mark-done"),
    LIST("list");

    private final String value;
    private static final Map commandsMap = new HashMap();

    Commands(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    static {
        for( Commands commands: Commands.values() ){
            commandsMap.put(commands, commands.value());
        }
    }

    public static boolean isValidCommand(String value) {
        return commandsMap.containsValue(value);
    }
}

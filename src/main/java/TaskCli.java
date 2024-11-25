import src.task.domain.Status;
import src.task.domain.Task;
import src.task.enums.Commands;
import src.task.enums.TaskStatus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;

public class TaskCli {
    public static void main(String[] args){
        try {
            String command = args[0];
            if(!Commands.isValidCommand(command)){
                throw new IllegalArgumentException("Command not allowed");
            }
            switch (command) {
                case "add" -> add(args[1]);
                case "update" -> update(args[1], args[2]);
                case "delete" -> delete(args[1]);
                case "mark-in-progress" -> update(args[1], TaskStatus.IN_PROGRESS);
                case "mark-done" -> update(args[1], TaskStatus.DONE);
                case "list" -> {

                    if(args.length == 2){
                        System.out.println(list(args[1]));
                        break;
                    }
                    System.out.println(list());
                }
            }
        } catch (Exception exception){
            throw new RuntimeException(exception);
        }
    }
    private static void add(String taskDescription) {
        System.out.println(taskDescription);
        System.out.println("Task added successfully (ID: 1)");
    }

    private static void update(String id, String newValue) {
        System.out.println("Id: " + id + ", New value:" + newValue);
        System.out.println("Task updated!");
    }

    private static void update(String id, TaskStatus status) {
        System.out.println("Id: " + id + ", New value:" + status.value());
        System.out.println("Task updated!");
    }

    private static void delete(String id ) {
        System.out.println("Id: " + id);
        System.out.println("Task deleted!");
    }

    private static ArrayList<Task> list(String status) {
        System.out.println("Status:" + status);
        return null;
    }

    private static ArrayList<Task> list() {
        System.out.println("List all");
        return null;
    }


}
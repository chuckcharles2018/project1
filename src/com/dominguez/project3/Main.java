package com.dominguez.project3;
import java.util.Collection;
import java.util.Comparator;


import java.util.*;

class Task implements Comparable<Task> {
    private String name;
    private String description;
    private int priority;

    Task(String name, String description, int priority) {
        setName(name);
        setDescription(description);
        setPriority(priority);
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public int getPriority() {
        return this.priority;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPriority(int priority) {
        if (priority < 0) {
            this.priority = 0;
        } else if (priority > 5) {
            this.priority = 5;
        } else {
            this.priority = priority;
        }
    }
    private void displayTasks(List<Task> tasks)
    {
        for (int i = 0; i < tasks.size(); i++)
        {
            Task task = (Task)tasks.get(i);
            System.out.println("Task index: " + i + ", Name: " + task
                    .getName() + ", Description: " + task
                    .getDescription() + ", Priority: " + task
                    .getPriority());
        }
    }

    @Override
    public int compareTo(Task compareTask) {

        int compareQuantity = ((Task) compareTask).getPriority();

        //ascending order
        return this.priority - compareQuantity;

        //descending order
        //return compareQuantity - this.quantity;

    }

    public static Comparator<Task> TaskNameComparator
            = new Comparator<Task>() {

        public int compare(Task task1, Task task2) {

            String taskName1 = task1.getName().toUpperCase();
            String taskName2 = task2.getName().toUpperCase();

            //ascending order
            return taskName1.compareTo(taskName2);

            //descending order
            //return fruitName2.compareTo(fruitName1);
        }

    };
}


class TaskCollection
{
    private List<Task> tasks;

    TaskCollection()
    {
        this.tasks = new LinkedList();
    }

    private Task createTask(String name, String description, int priority)
    {
        return new Task(name, description, priority);
    }

    public void addTask(String name, String description, int priority)
    {
        this.tasks.add(createTask(name, description, priority));
    }

    public void removeTask(int index)
    {
        if (this.tasks.size() > index) {
            this.tasks.remove(index);
        }
    }

    public void updateTask(int index, String name, String description, int priority)
    {
        this.tasks.set(index, createTask(name, description, priority));
    }

    public List<Task> getTasks()
    {
        return this.tasks;
    }

    public List<Task> getTasks(int priorty)
    {
        List<Task> matchedTasks = new LinkedList();
        for (Task task : this.tasks) {
            if (task.getPriority() == priorty) {
                matchedTasks.add(task);
            }
        }
        return matchedTasks;
    }
}

class TaskView
{
    private TaskCollection taskCollection;
    private Scanner scanner = new Scanner(System.in);

    TaskView(TaskCollection collection)
    {
        this.taskCollection = collection;
    }

    private boolean isInteger(String string)
    {
        try
        {
            Integer.parseInt(string);
        }
        catch (NumberFormatException|NullPointerException e)
        {
            return false;
        }
        return true;
    }

    private String prompt(String message)
    {
        System.out.println(message);
        return this.scanner.nextLine();
    }

    private int promptInt(String message)
    {
        String response = prompt(message);

        boolean isInt = isInteger(response);
        while (!isInt)
        {
            response = prompt(message);
            isInt = isInteger(response);
        }
        return Integer.parseInt(response);
    }

    private void add()
    {
        String name = prompt("What is the new task's name?");
        String description = prompt("What is the new task's description?");
        int priority = promptInt("What is the new task's priority?");
        this.taskCollection.addTask(name, description, priority);
    }

    private void remove()
    {
        int index = promptInt("What is the index of the task you want to remove?");
        this.taskCollection.removeTask(index);
    }

    private void update()
    {
        int index = promptInt("What is the index of the task you want to update.");
        String newName = prompt("Enter the new name of the task.");
        String newDescription = prompt("Enter the new Description of the task");
        int newPriority = promptInt("Enter the new priority of the task");
        this.taskCollection.updateTask(index, newName, newDescription, newPriority);
    }

    private void displayTasks(List<Task> tasks)
    {
        for (int i = 0; i < tasks.size(); i++)
        {
            Task task = (Task)tasks.get(i);
            System.out.println("Task index: " + i + ", Name: " + task
                    .getName() + ", Description: " + task
                    .getDescription() + ", Priority: " + task
                    .getPriority());
        }
    }






    private void list()
    {
        displayTasks(this.taskCollection.getTasks());
    }

    private void listByPriority()
    {
        int priority = promptInt("Enter a priority");
        displayTasks(this.taskCollection.getTasks(priority));
    }

    private void menu()
    {
        boolean endLoop = false;
        while (!endLoop)
        {
            System.out.println("Menu");
            System.out.println("1) Add a task.");
            System.out.println("2) Remove a task.");
            System.out.println("3) Update a task.");
            System.out.println("4) List all tasks.");
            System.out.println("5) List all tasks of a certain priority.");
            System.out.println("0) Exit");

            int userInput = promptInt("Choose an option.");
            switch (userInput)
            {
                case 0:
                    endLoop = true;
                    break;
                case 1:
                    add();
                    break;
                case 2:
                    remove();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    list();
                    break;
                case 5:
                    listByPriority();
            }
        }
    }

    public void run()
    {
        menu();
    }
}

public class Main {
    public static void main(String[] args) {
        TaskCollection collection = new TaskCollection();
        TaskView view = new TaskView(collection);
        view.run();
     //   Task display = new Task();
       // Task.displayTasks();

      //  Collections.sort(TaskCollection.tasks);

      //  for (Task contact : tasks) {
         //   contact.display();
        }
    }
    //}


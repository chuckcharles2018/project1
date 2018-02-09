package com.dominguez.project1;
//Bryan Dominguez
//February 8th, 2018
import java.util.*;
import java.io.PrintStream;
public class Main {
	static String[] add(String[] toDos, String newTask)
	{
		String[] newTodos = new String[toDos.length + 1];
		for (int i = 0; i < toDos.length; i++) {
			newTodos[i] = toDos[i];
		}
		newTodos[(newTodos.length - 1)] = newTask;
		return newTodos;
	}

	static String[] remove(String[] toDos, int index)
	{
		if ((index < 0) || (index >= toDos.length)) {
			return toDos;
		}
		String[] newTodos = new String[toDos.length - 1];
		for (int i = 0; i < toDos.length; i++) {
			if (i < index) {
				newTodos[i] = toDos[i];
			} else if (i != index) {
				newTodos[(i - 1)] = toDos[i];
			}
		}
		return newTodos;
	}

	static void update(String[] toDos, int index, String newTask)
	{
		if ((index < 0) || (index >= toDos.length)) {
			return;
		}
		toDos[index] = newTask;
	}

	static void list(String[] toDos)
	{
		for (int i = 0; i < toDos.length; i++) {
			System.out.println(i + ". " + toDos[i]);
		}
	}
	public static void main(String[] args) {
		String[] toDos = new String[0];
		Boolean continueLoop = Boolean.valueOf(true);
		Scanner scanner = new Scanner(System.in);
		while (continueLoop.booleanValue()) {
			System.out.println("Please choose an option:\n" +
					"(1) Add a task.\n" +
					"(2) Remove a task.\n" +
					"(3) Update a task.\n" +
					"(4) List all tasks.\n" +
					"(0) Exit.\n");
			String input = scanner.nextLine();
			switch (input)
			{
				case "1":
					System.out.println("Enter a description of the new task.");
					String newTask = scanner.nextLine();
					toDos = add(toDos, newTask);
					break;
				case "2":
					System.out.println("Enter the index of the task to remove.");
					int index = Integer.parseInt(scanner.nextLine());
					toDos = remove(toDos, index);
					break;
				case "3":
					System.out.println("Enter the index of the task to update.");
					int newIndex = Integer.parseInt(scanner.nextLine());
					System.out.println("Enter the new description of the task.");
					String anotherNewTask = scanner.nextLine();
					update(toDos, newIndex, anotherNewTask);
					break;
				case "4":
					list(toDos);
					break;
				case "0":
					continueLoop = Boolean.valueOf(false);
			}
		}
	}
}
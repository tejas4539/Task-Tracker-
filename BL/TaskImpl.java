package BL;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import pojo.Status;
import pojo.Task;

public class TaskImpl implements ITask {

	List<Task> tasks = new ArrayList<>();
	int randomId = 1;

	@Override
	public String addTask(String description) {
		int id = randomId;
		LocalDateTime created = LocalDateTime.now();
		Task t = new Task(id, description, Status.Todo, created, created);

		tasks.add(t);
		++randomId;
		return "Task added sucessfully (ID :" + id + ")";
	}

	@Override
	public String updateTask(int id, String description) {
		if (tasks.isEmpty())
			return "task list is empty";
		LocalDateTime updates = LocalDateTime.now();
		for (Task t : tasks) {
			if (t.getId() == id) {
				t.setDescription(description);
				t.setUpdatedAt(updates);
				return "task updated sucessfully";
			}
		}
		return "no task found of id";

	}

	@Override
	public String deleteTask(int id) {
		if (tasks.isEmpty())
			return "task list is empty";
		boolean deleted = tasks.removeIf(t -> t.getId() == id);
		if (deleted) {
			return "task deleted sucessfully";
		}
		return "task not found wrong id";
	}

	@Override
	public String updateProgress(int id, Status status) {
		if (tasks.isEmpty())
			return "task list is empty";
		LocalDateTime updates = LocalDateTime.now();
		for (Task t : tasks) {
			if (t.getId() == id) {
				t.setStatus(status);
				t.setUpdatedAt(updates);
				return "progress updated of a task";
			}
		}
		return "no task found";
	}

	@Override
	public void getAllTask() {
		if (tasks.isEmpty()) {
			System.out.println("task list is empty");
			return;
		}
		tasks.forEach(t -> System.out.println(t));
	}

	@Override
	public void getDoneTask() {
		if (tasks.isEmpty()) {
			System.out.println("task list is empty");
			return;
		}
		List<Task> doneTask = tasks.stream().filter(t -> t.getStatus() == Status.Done).toList();
		if (doneTask.isEmpty()) {
			System.out.println("No tasks with status DONE found");
			return;
		} 
		
		doneTask.forEach(System.out::println);
	}

}

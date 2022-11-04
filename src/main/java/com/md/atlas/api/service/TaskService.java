package com.md.atlas.api.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.md.atlas.api.model.Task;
import com.md.atlas.api.repo.TaskRepository;

@Service
public class TaskService {

	@Autowired
	private TaskRepository taskRepository;

	public Task saveTask(Task task) {
		task.setId(UUID.randomUUID().toString().split("-")[0]);
		return taskRepository.save(task);
	}

	public List<Task> getAllTask() {
		return taskRepository.findAll();
	}

	public Task findTaskById(String id) {
		return taskRepository.findById(id).get();
	}

	public List<Task> getAllTaskByPriority(String priority) {
		return taskRepository.findByPriority(priority);
	}

	public List<Task> getTaskByAssignee(String assignee) {
		return taskRepository.getTasksByAssignee(assignee);
	}

	public Task updateTask(Task taskRquest) {
		// get the task
		Task existingTask = taskRepository.findById(taskRquest.getId()).get();
		existingTask.setAssignee(taskRquest.getAssignee());
		existingTask.setDescription(taskRquest.getDescription());
		existingTask.setPriority(taskRquest.getPriority());

		return taskRepository.save(existingTask);
	}

	public String deleteTask(String taskId) {
		taskRepository.deleteById(taskId);
		return taskId + " task is deleted from dashboard.";
	}

}

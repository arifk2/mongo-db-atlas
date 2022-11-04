package com.md.atlas.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.md.atlas.api.model.Task;
import com.md.atlas.api.service.TaskService;

@RestController
@RequestMapping("/task")
public class TaskController {

	@Autowired
	private TaskService taskService;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Task saveTask(@RequestBody Task task) {
		return taskService.saveTask(task);
	}

	@GetMapping("/taskId/{taskId}")
	public Task getTaskFromTaskId(@PathVariable String taskId) {
		return taskService.findTaskById(taskId);
	}

	@GetMapping
	public List<Task> getAllTask() {
		return taskService.getAllTask();
	}

	@GetMapping("/priority/{priority}")
	public List<Task> getAllTaskByPriority(@PathVariable String priority) {
		return taskService.getAllTaskByPriority(priority);
	}

	@GetMapping("/{assignee}")
	public List<Task> getTaskByAssignee(@PathVariable String assignee) {
		return taskService.getTaskByAssignee(assignee);
	}

	@PutMapping
	public Task updateTask(@RequestBody Task task) {
		return taskService.updateTask(task);
	}

	@DeleteMapping("/{taskId}")
	public String deleteTask(@PathVariable String taskId) {
		return taskService.deleteTask(taskId);
	}
}

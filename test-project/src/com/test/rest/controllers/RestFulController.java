package com.test.rest.controllers;


import java.text.ParseException;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RestFulController {
 
	//RestFulController taskmanagerservice=new RestFulController();
 
	@RequestMapping(value="/tasks1",method = RequestMethod.GET,headers="Accept=application/json")
	  public String getResoinse(String value) {  
		System.out.println("Rest Service is called:"+value);
		return "success";
	  }
	@RequestMapping(value="/tasks/test/{param1}",method = RequestMethod.GET
			,headers="Accept=application/json")
	  public String getResponse(@PathVariable("param1")  String param1) {  
		System.out.println("Rest Service is 123called:"+param1);
		return "success";
	  }
	
	/*
	@RequestMapping(value="/tasks",method = RequestMethod.GET,headers="Accept=application/json")
  public List<task> getAllTasks() {  
   List<task> tasks=taskmanagerservice.getAllTasks();
   return tasks;
   
  }
  
  
  @RequestMapping(value="/tasks/archive/{taskIds}",method = RequestMethod.POST,headers="Accept=application/json")
  public List<task> archiveAllTasks(@PathVariable int[] taskIds) { 
   for(int i=0;i<taskids .length="" ask="" i="" list="" taskids="" taskmanagerservice.archivetask=""> tasks=taskmanagerservice.getAllTasks();
   return tasks;
 
  }
  
  @RequestMapping(value="/tasks/{taskId}/{taskStatus}",method = RequestMethod.POST,headers="Accept=application/json")
  public List<task> changeTaskStatus(@PathVariable int taskId,@PathVariable String taskStatus) throws ParseException { 
   taskmanagerservice.changeTaskStatus(taskId,taskStatus);   
   return taskmanagerservice.getAllTasks();
   
  }
  
  @RequestMapping(value="/tasks/insert/{taskName}/{taskDesc}/{taskPriority}/{taskStatus}",method = RequestMethod.POST,headers="Accept=application/json")
  public List<task> addTask(@PathVariable String taskName,@PathVariable String taskDesc,@PathVariable String taskPriority,@PathVariable String taskStatus) throws ParseException { 
  Task task = new Task();
  task.setTaskName(taskName);
  task.setTaskDescription(taskDesc);
  task.setTaskPriority(taskPriority);
  task.setTaskStatus(taskStatus);
  taskmanagerservice.addTask(task);
  return taskmanagerservice.getAllTasks();
   
  } */       
}
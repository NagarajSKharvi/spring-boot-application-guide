package com.example.demo.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Todo;

@Service
public class TodoService {
	
	private static List<Todo> todos = new ArrayList<>();
	private static int todoCount = 5;
	
	static {
		todos.add(new Todo(1, "Nagaraj S Kharvi", "Java New Features", new Date(), false));
		todos.add(new Todo(2, "Nagaraj S Kharvi", "Spring Boot", new Date(), false));
		todos.add(new Todo(3, "Nagaraj S Kharvi", "Hibernate", new Date(), false));
		todos.add(new Todo(4, "Prashanth Kharvi", "Docker", new Date(), false));
		todos.add(new Todo(5, "Prashanth Kharvi", "Kubernates", new Date(), false));
	}
	
	public Todo addTodo(Todo todoResource) {
        int id = ++todoCount;
        Todo todo = buildTodo(new Todo(), todoResource, true);
        todo.setId(id);
        todos.add(todo);
        return getTodo(id);
    }
	
	public Todo updateTodo(Todo todoResource) {
		Todo todo = getTodo(todoResource.getId());
		buildTodo(todo, todoResource, false);
		return getTodo(todoResource.getId());
    }
	
	public Todo getTodo(int id) {
        Todo findTodo = null;
		for (Todo todo : todos) {
            if (todo.getId() == id) {
                findTodo = todo;
            }
        }
        return findTodo;
    }
	
	public List<Todo> listTodo(String user) {
        List<Todo> filteredTodos = new ArrayList<>();
        for (Todo todo : todos) {
            if (todo.getUser().equals(user)) {
                filteredTodos.add(todo);
            }
        }
        return filteredTodos;
    }

    public boolean deleteTodo(int id) {
    	 Iterator<Todo> iterator = todos.iterator();
         while (iterator.hasNext()) {
             Todo todo = iterator.next();
             if (todo.getId() == id) {
                 iterator.remove();
             }
         }
    	return true;
    }
    
    private Todo buildTodo(Todo todo, Todo todoResource, boolean isNew) {
		if (isNew) {
			todo.setUser(todoResource.getUser());
		}
    	todo.setDesc(todoResource.getDesc());
		todo.setTargetDate(todoResource.getTargetDate());
		todo.setDone(todo.isDone());
		return todo;
	}
}
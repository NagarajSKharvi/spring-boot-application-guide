package com.example.demo.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import javax.validation.constraints.Size;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Todo {
    
	private int id;
    private String user;
    @Size(min = 10, message = "Enter atleast 10 characters")
    private String desc;
    private Date targetDate;
    private boolean isDone;
	
    public Todo(String user, String desc, Date targetDate, boolean isDone) {
		super();
		this.user = user;
		this.desc = desc;
		this.targetDate = targetDate;
		this.isDone = isDone;
	}
}
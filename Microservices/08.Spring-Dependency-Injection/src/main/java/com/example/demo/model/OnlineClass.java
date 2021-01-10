package com.example.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString
@NoArgsConstructor
public class OnlineClass {
	
	private Smartphone smartphone;

	public OnlineClass(Smartphone smartphone) {
		super();
		this.smartphone = smartphone;
	}
}

package com.example.demo.example;

import com.example.demo.model.IPhone;
import com.example.demo.model.OnlineClass;

public class Main {

	public static void main(String[] args) {
		
		IPhone iphone = new IPhone();
		System.out.println(iphone.display());
		
		OnlineClass oc = new OnlineClass(new IPhone()); 
		System.out.println(oc.getSmartphone().display());
	}
}
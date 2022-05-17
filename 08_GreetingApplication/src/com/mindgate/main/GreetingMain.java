package com.mindgate.main;

import com.mindgate.pojo.GoodMorningGreeter;
import com.mindgate.pojo.Greetings;

public class GreetingMain {
	public static void main(String[] args) {
		Greetings greetings = new GoodMorningGreeter();
		greetings.greet();
		
		Greetings greetings2 = () -> System.out.println("Good Afternoon");
		greetings2.greet();
	}
}

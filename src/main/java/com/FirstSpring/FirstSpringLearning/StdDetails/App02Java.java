package com.FirstSpring.FirstSpringLearning.StdDetails;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02Java {
	public static void main(String[] args) {
		
	try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);)
	{
		
		System.out.println("Result: "+context.getBean("name"));
		System.out.println("Result: "+context.getBean("myage"));
		System.out.println("Result: "+context.getBean("person"));
		//System.out.println("Result: "+context.getBean(Person.class));
		System.out.println("Result: "+context.getBean("details"));
		//alternatively we can pass them like passing as parameter
		System.out.println("Result: "+context.getBean(Person.class));
		//System.out.println("Result: "+context.getBean(Person.class).address());
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		int count = context.getBeanDefinitionCount();
		System.out.println("Total beans are = "+count);
	}catch (Exception e) {
		System.out.println(e.getClass()+e.getMessage());
	}
		
}
}
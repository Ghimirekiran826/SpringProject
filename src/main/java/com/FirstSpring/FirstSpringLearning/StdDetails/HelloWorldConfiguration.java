package com.FirstSpring.FirstSpringLearning.StdDetails;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String address,long phone){};
record StudentDetails(String name,int age,Person phone){};
@Configuration
public class HelloWorldConfiguration {
	@Bean
	public String name() {
		return "Kiran Ghimire";
	}
	@Bean(name = "myage")
	public int age()
	{
		return 27;
	}
	@Bean
	public Person person()
	{
		return new Person("Kathmandu",98434);
	}
	@Bean(name = "firstperson")
	public Person person1()
	{
		return new Person("Lamjung",98460);
	}
	@Bean(name = "secondperson")
	@Primary //if multiple beans use primary to get it and ignore other beans
	public Person person2()
	{
		return new Person("Pokhara",98462);
	}
	
	@Bean
	public StudentDetails details()
	{
		return new StudentDetails(name(),age(),person());
	}
}

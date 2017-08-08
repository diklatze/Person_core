package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class PersonApplication {
	
	@Autowired
	PersonRepository repo; 

	
	@CrossOrigin
	@RequestMapping(value = "/person", method = RequestMethod.GET)
	@ResponseBody
	public List<Person> get() {
//		ArrayList<Person> list = new ArrayList<>();
//		Person person = new Person();
//		Person person1= new Person();
//		Person person2= new Person();
//		person.setName("Dikla");
//		person.setAge(27);
//		person.setGender("Female");
//		list.add(person);
//		
//		person1.setName("Danny");
//		person1.setAge(40);
//		person1.setGender("Male");
//		list.add(person1);
//		
//		
//		list.add(person2);
//		
//		repo.save(list);
		
	//	return list;
		return repo.findAll();
	}
	
	
	@CrossOrigin
	@RequestMapping(value = "/person", method = RequestMethod.POST)
	@ResponseBody
	public Person post(@RequestBody Person person) {
		repo.save(person);
		return person;
	}
//		
//	public static void main(String[] args) {
//		SpringApplication.run(PersonApplication.class, args);
//	}
	
	
	@CrossOrigin
	@RequestMapping(value = "/person", method = RequestMethod.DELETE)
	@ResponseBody
	public void delete(@RequestBody Person person) {
		repo.delete(person);
		//return person;
	}
	
	
}

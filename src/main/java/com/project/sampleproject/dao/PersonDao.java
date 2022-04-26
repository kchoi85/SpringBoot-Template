package com.project.sampleproject.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.project.sampleproject.model.Person;

public interface PersonDao {
	int insertPerson(UUID id, Person person);
	
	// default method allows us to add method body in an interface
	default int insertPerson(Person person) {
		UUID id = UUID.randomUUID();
		return insertPerson(id, person);
	}
	
	List<Person> selelectAllPeople();
	
	Optional<Person> selectPersonById(UUID id);
	
	int deletePersonById(UUID id);
	
	int updatePersonById(UUID id, Person person);
}

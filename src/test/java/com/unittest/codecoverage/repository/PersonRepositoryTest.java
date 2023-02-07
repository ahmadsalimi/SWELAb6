package com.unittest.codecoverage.repository;

import com.unittest.codecoverage.models.Gender;
import com.unittest.codecoverage.models.Person;
import com.unittest.codecoverage.repositories.PersonRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonRepositoryTest {
    @Test
    public void testInsert_shouldInsertPersonWithSuccessWhenAllPersonsInfoIsFilled() {
        var person = new Person();
        person.setName("Name");
        person.setAge(21);
        person.setGender(Gender.M);

        var repository = new PersonRepository();
        var insertedPerson = repository.insert(person);
        assertEquals(person, insertedPerson);
        assertEquals(person.getName(), insertedPerson.getName());
        assertEquals(person.getAge(), insertedPerson.getAge());
        assertEquals(person.getGender(), insertedPerson.getGender());
    }
}

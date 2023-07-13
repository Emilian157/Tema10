package org.fasttrackit.exercise3;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Person> persons;

    public Company() {
        persons = new ArrayList<>();
    }

    public Person getManager() {
        for (Person person : persons) {
            if (person.getPosition().equals("manager")) {
                return person;
            }
        }
        return null;
    }

    public List<Person> getPersons(String profession) {
        List<Person> specificProfession = new ArrayList<>();
        for (Person person : persons) {
            if (person.getPosition().equals(profession)) {
                specificProfession.add(person);
            }
        }
        return specificProfession;
    }

    public List<Person> getPersonsOlder(int age) {
        List<Person> specificAge = new ArrayList<>();
        for (Person person : persons) {
            if (person.getAge() > age) {
                specificAge.add(person);
            }
        }
        return specificAge;
    }

    public List<Person> getPerson(String filterName) {
        List<Person> specificName = new ArrayList<>();
        for (Person person : persons) {
            if (person.getName().contains(filterName)) {
                specificName.add(person);
            }
        }
        return specificName;
    }

    public void employ(Person person) {
        persons.add(person);
    }
}

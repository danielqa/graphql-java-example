package br.com.example.graphqljava.repository;

import br.com.example.graphqljava.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Repository
public class PersonRepository {

    private final List<Person> people;

    public PersonRepository() {
        people = new ArrayList<>();
        people.add(new Person(1, "Daniel Queiroz"));
        people.add(new Person(2, "Daniel Araújo"));
    }

    public List<Person> findPeople() {
        return people;
    }

    public Optional<Person> findById(Integer id) {
        return people.stream().filter(person -> Objects.equals(person.getId(), id)).findFirst();
    }
}

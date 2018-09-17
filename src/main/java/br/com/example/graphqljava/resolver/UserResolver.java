package br.com.example.graphqljava.resolver;

import br.com.example.graphqljava.model.Person;
import br.com.example.graphqljava.model.User;
import br.com.example.graphqljava.repository.PersonRepository;
import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserResolver implements GraphQLResolver<User> {

    private final PersonRepository personRepository;

    public UserResolver(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Optional<Person> person(User user) {
        return this.personRepository.findById(user.getPersonId());
    }
}

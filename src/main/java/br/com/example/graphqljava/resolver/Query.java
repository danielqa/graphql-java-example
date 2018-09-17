package br.com.example.graphqljava.resolver;

import br.com.example.graphqljava.model.Person;
import br.com.example.graphqljava.model.User;
import br.com.example.graphqljava.repository.PersonRepository;
import br.com.example.graphqljava.repository.UserRepository;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Query implements GraphQLQueryResolver {

    private final UserRepository userRepository;
    private final PersonRepository personRepository;

    public Query(UserRepository userRepository, PersonRepository personRepository) {
        this.userRepository = userRepository;
        this.personRepository = personRepository;
    }

    public List<User> users() {
        return this.userRepository.findUsers();
    }

    public List<Person> people() {
        return this.personRepository.findPeople();
    }
}

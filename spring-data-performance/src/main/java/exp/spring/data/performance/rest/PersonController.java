package exp.spring.data.performance.rest;

import exp.spring.data.performance.domain.Person;
import exp.spring.data.performance.repo.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @RequestMapping(method = RequestMethod.GET, path = "/person/{id}")
    Person getPerson(@PathVariable("id") Long id) {

        return personRepository.findById(id)
                .orElse(new Person("Raj", "Malhotra", 5, "222-333-4444"));
    }
}

package exp.spring.data.performance.repo;

import exp.spring.data.performance.domain.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> { }

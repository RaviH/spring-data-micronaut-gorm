package exp.spring.data.performance;

import exp.spring.data.performance.domain.Person;
import exp.spring.data.performance.repo.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataPerformanceApplication {
	private static final Logger log = LoggerFactory.getLogger(SpringDataPerformanceApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringDataPerformanceApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(PersonRepository repository) {
		return (args) -> {
			// save a couple of customers
			repository.save(new Person("Jack", "Bauer", 10, "222-333-4444"));
			repository.save(new Person("Foo", "Bar", 10, "222-333-4444"));
			repository.save(new Person("Jacky", "Spider", 10, "222-333-4444"));
			repository.save(new Person("Jackie", "Superman", 10, "222-333-4444"));
			repository.save(new Person("Jackie", "Chan", 10, "222-333-4444"));
		};
	}
}

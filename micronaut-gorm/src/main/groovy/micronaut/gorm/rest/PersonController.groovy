package micronaut.gorm.rest

import groovy.transform.CompileStatic
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import micronaut.gorm.api.PersonApi
import micronaut.gorm.domain.Person
import micronaut.gorm.service.PersonService

@Controller("/micronaut/person")
@CompileStatic
class PersonController implements PersonApi {

    final PersonService personService

    PersonController(PersonService personService) {
        this.personService = personService
    }

    @Override
    @Get("/{id}")
    Person show(Long id) {
        personService.find(id)
    }
}

package micronaut.gorm.service


import grails.gorm.services.Service
import groovy.transform.CompileStatic
import micronaut.gorm.domain.Person

import javax.validation.constraints.NotNull

@Service(Person)
@CompileStatic
interface PersonService {

    int count()

    Person save(@NotNull Person person)

    List<Person> findAll()

    Person find(@NotNull Long id)

    void delete(@NotNull Long id)
}

package micronaut.gorm.init


import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import io.micronaut.context.annotation.Requires
import io.micronaut.context.env.Environment
import io.micronaut.context.event.ApplicationEventListener
import io.micronaut.runtime.server.event.ServerStartupEvent
import micronaut.gorm.domain.Person
import micronaut.gorm.service.PersonService

import javax.inject.Singleton

@Slf4j
@CompileStatic
@Singleton
@Requires(notEnv = Environment.TEST)
class Bootstrap implements ApplicationEventListener<ServerStartupEvent> {

    final PersonService personService

    Bootstrap(PersonService personService) {
        this.personService = personService
    }

    @Override
    void onApplicationEvent(ServerStartupEvent event) {
        if (!personService.count()) {
            log.debug("Loading data...")
            personService.save(new Person(firstName: "Omar", lastName: "Bautista", age: 31, phone: "444-124-2253"))
            personService.save(new Person(firstName: "Juan", lastName: "Contreras", age: 29, phone: "333-234-8763"))
            personService.save(new Person(firstName: "Diego", lastName: "Luna", age: 30, phone: "553-763-6353"))
            log.debug("... Finish loading data.")
        }
    }
}

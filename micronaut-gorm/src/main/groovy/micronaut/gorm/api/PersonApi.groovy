package micronaut.gorm.api

import groovy.transform.CompileStatic
import io.micronaut.http.annotation.Get
import micronaut.gorm.domain.Person

@CompileStatic
interface PersonApi {

    @Get("/{id}")
    Person show(Long id)
}

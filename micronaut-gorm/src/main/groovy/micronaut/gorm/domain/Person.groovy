package micronaut.gorm.domain

import grails.gorm.annotation.Entity
import groovy.transform.Canonical
import groovy.transform.CompileStatic

@Entity
@Canonical
@CompileStatic
class Person {

    String firstName
    String lastName
    int age
    String phone
}

package meeting1.ex3

import groovy.transform.Canonical

@Canonical
class Person {

    String firstName
    String lastName
    int age

    // Method with optional Parameters
    // no Return
    String saySomething(String text = "Some default Text") {
        "$firstName $lastName says: $text"
    }
}

def p = new Person(age: 40, firstName : "John", lastName : "Smith")

assert p.saySomething() == "John Smith says: Some default Text"
assert p.saySomething("My Own Text") == "John Smith says: My Own Text"







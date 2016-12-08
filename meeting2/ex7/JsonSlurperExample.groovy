package meeting2.ex7

import groovy.json.JsonOutput
import groovy.json.JsonSlurper

def rawString = '{"name" : "John", "lastName" : "Smith", "age" : 30}'
def jsonSlurper = new JsonSlurper()
def person = jsonSlurper.parseText (rawString)
assert person instanceof Map
assert person.name == "John"
assert person.age == 30

/////////////////////////////////////////////////////////////////////////////////////////

def jsonString = JsonOutput.toJson(person)
println jsonString

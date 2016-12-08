package meeting3.ex9

import groovy.transform.EqualsAndHashCode
import groovy.transform.Immutable
import groovy.transform.ToString
import groovy.transform.TupleConstructor

def printInfo(cl) {
    println "======================================"
    println cl.name
    println "Methods:    " + cl.metaClass.methods.collect {it.name}
    println "Properties: " + cl.metaClass.properties.collect {it.name}
    println "======================================"

}
class Cat {}

printInfo(Cat.class)

///////////////////////////////////
class Cat2 {
    String name
}
// note getName/setName methods and a new property
printInfo(Cat2.class)
println new Cat2()
//println new Cat2('Garfield')
///////////////////////////////////


@ToString
@TupleConstructor
class Cat3 {
    String name
}

printInfo(Cat3.class)
println new Cat3('Garfield')

///////////////////////////////////
@EqualsAndHashCode
@ToString
@TupleConstructor
class Cat4 {
    String name
}
printInfo(Cat4)
// Note that since we have an 'equals' method two Cat4 objects can be compared
assert new Cat3('Garfield') != new Cat3('Garfield')
assert new Cat4('Garfield') == new Cat4('Garfield')

////////////////////////////////////
printInfo(Cat5)
@Immutable
@ToString
class Cat5 {
    String name
}

Cat5 cat5 = new Cat5(name : 'Tom')
try {
    cat5.name = 'Garfield'
}catch(ReadOnlyPropertyException ex) {
    println "Failed to change an immutable class"
}
println cat5


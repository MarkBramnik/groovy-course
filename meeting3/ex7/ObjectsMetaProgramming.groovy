package meeting3.ex7

class Person {

}

// Groovy classes have metaclass and its an Expando
Person p = new Person()
p.metaClass.sayHello = {-> println "Hello, $name"}
p.metaClass.name = "John"
p.sayHello()

p.metaClass.with {
    lastName = 'Smith'
    age      = 25
}

println "Properties : $p.properties"
println p.metaClass.methods.collect {MetaMethod m-> m.name}



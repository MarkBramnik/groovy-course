package meeting3.ex6

Expando ex = new Expando()
println ex
println ex.dump()

println "=================="
ex.name = "john"
println ex
println ex.dump()
println "=================="

ex.sing = {
    println " $name is a singer"
}
println ex
println ex.dump()
println "=================="
ex.sing()
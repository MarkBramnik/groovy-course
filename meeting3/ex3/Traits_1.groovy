package meeting3.ex3

trait FlyingAbility {
    String fly() {"Hey, I'm flying"}
}

class Bird implements FlyingAbility{}
class Aircraft implements FlyingAbility {}

println new Bird().fly()
println new Aircraft().fly()
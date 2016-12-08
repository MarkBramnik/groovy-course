package meeting3.ex1

class Duck {
    void quack() {println "I'm a duck"}
}
class Rabbit {
    void quack() {println "I'm a rabbit"}
}

def zoo = [new Duck(), new Rabbit()]

def quackTheZoo(z) {
    z.each {
        it.quack()
    }
}

quackTheZoo(zoo)
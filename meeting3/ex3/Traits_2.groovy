package meeting3.ex3

trait Flyer {
    void fly() {println "Fly"}
}
trait Eater {
    void eat() {println "Eat"}
}

class Owl implements Flyer, Eater {

}

new Owl().fly()
new Owl().eat()


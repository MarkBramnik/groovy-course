package meeting3.ex3


trait WithCounter {

    private int counter = -1
    int count() {counter+=1; counter}
}

trait Camera {
    void snapshot() {println 'Taking a picture'}
}

class SmartPhone implements WithCounter, Camera {

}

SmartPhone smartPhone = new SmartPhone()
(1..3).each {
   println smartPhone.count()
}
smartPhone.snapshot()

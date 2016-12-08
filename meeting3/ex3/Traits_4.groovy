package meeting3.ex3

trait A {
    void foo() {println 'A'}
}
trait B {
    void foo() {println 'B'}
}

class C implements A,B {}

class D implements A,B {
    void foo() {
        A.super.foo()
    }
}

// by default the last trait works
new C().foo()
// in D the "working" trait is specified explicitly
new D().foo()
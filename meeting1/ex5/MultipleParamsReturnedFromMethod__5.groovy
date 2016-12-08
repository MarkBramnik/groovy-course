package meeting1.ex5


def f () {
    [1,2,3]
}

def func(x, y) {
    [x **2, y **3]
}

def (a,b) = func(2,3)
assert a == 4
assert b == 27

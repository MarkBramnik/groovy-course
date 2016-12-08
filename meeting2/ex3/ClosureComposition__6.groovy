package meeting2.ex3


def xPlus5 = {x -> x + 5}

def xPow2 = {x -> x ** 2}

assert xPlus5(6) == 11
assert xPow2(9)  == 81

// (x + 5) ^ 2
def composed1 = xPlus5 >> xPow2

assert composed1(3) == 64

// (x ^ 2) + 5
def composed2 = xPlus5 << xPow2

assert composed2(3) == 14
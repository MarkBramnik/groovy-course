package meeting1.ex4

def number1 = 10
def number2 = 100
def number3 = -100

assert number1 <=> number2 == -1
assert number2 <=> number1 ==  1
assert number3 <=> number3 ==  0
package meeting1.ex2

def team = "Runtime"
def anotherTeam = "CI-CD"

assert "Hello ${team} and $anotherTeam" == "Hello Runtime and CI-CD"

assert "Hello ${team} and $anotherTeam".padLeft(50) == "Hello Runtime and CI-CD".padLeft(50)


def str = "Hello ${team} and $anotherTeam"
assert str.values == ["Runtime", "CI-CD"]
assert str.valueCount == 2

assert str[0..4] == "Hello"

//assert str[0..-11] == "Hello Runtime"

assert "Hello".reverse() == "olleH"

assert "Hello" * 2 == "HelloHello"



"Hello".eachWithIndex {def c, def index ->   println "$index    $c"}


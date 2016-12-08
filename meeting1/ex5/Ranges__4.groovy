package meeting1.ex5

assert 1 + 2 + 3 + 4 + 5 == (1..5).sum()

assert (1..5).step(2) == [1,3,5]

assert (3..1).containsWithinBounds(3)


assert !(3..1).containsWithinBounds(5)

assert (1 ..<5) == [1,2,3,4]


def stringRange = ("a".."z")

assert ["a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"] == stringRange

enum Colors {
    RED,
    GREEN,
    BLUE,
    WHITE,
    BLACK
}

def colorRange = (Colors.RED .. Colors.BLACK)

assert [Colors.RED, Colors.GREEN, Colors.BLUE, Colors.WHITE, Colors.BLACK] == colorRange



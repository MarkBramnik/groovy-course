package meeting2.ex3


// Curried closure  = partially applied closure

def nCopies = {int n, String str ->
    str * n
}

assert nCopies(4, "abc") == "abcabcabcabc"

def twice = nCopies.curry(2)

assert twice("abc") == "abcabc"


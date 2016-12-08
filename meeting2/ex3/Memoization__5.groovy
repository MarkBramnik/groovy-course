package meeting2.ex3

// Sometimes we know that the closure function will be called with the same parameters a lot of times
// So it makes sense to "cache" the intermediate results.
// This is called "memoization":

def fib

fib = { long n -> n < 2 ? n : fib(n-1) + fib(n-2) }

// TOO SLOW!!!
//println fib(100)


fib = { long n -> n < 2 ? n : fib(n-1) + fib(n-2) }.memoize()

println fib(100)
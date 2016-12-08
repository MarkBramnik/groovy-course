package meeting2.ex3

def measure(Closure c) {
    long start = System.currentTimeMillis()
    Object res = c.call()
    long end = System.currentTimeMillis()
    println "Took ${end - start} ms"
    res
}


def result = measure {
    def res = 0
    1.upto(10000)  {
        res += Math.sqrt(it)
    }
    res
 }

println result

///////////////////// Some cooler version:
result = measure {
    (1..10000).inject(0) {aggregator, i -> aggregator + Math.sqrt(i) }
}
println result

result = measure {
    (1..10000).sum {Math.sqrt(it)}
}
println result

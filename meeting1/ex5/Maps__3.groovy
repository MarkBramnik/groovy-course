package meeting1.ex5

def map = [:]
map["a"] = 10
map["b"] = 20
map["c"] = 30


assert map["a"] == 10
assert map["z"] == null

assert map.a == 10

assert ["a" : 10, "b" : 20, "c" : 30 ] == map

assert map.keySet() == ["a","b","c"] as Set


map.eachWithIndex {p, v, ind ->
    println "$ind :   $p --> $v"
}
package meeting3.ex5

class Vector {

    Integer [] nums

    // operator overloading
    def plus(other) {
        if(nums.size() != other.nums.size()) {
            throw new IllegalArgumentException("Vector Dimensions must match")
        }
            [nums, other.nums].transpose()*.sum()
    }

    // another example of operator overloading
    def getAt(ind) {
        if(ind <0 || ind >=nums.length) {
            throw new IllegalArgumentException("Index is out of range")
        }
        return nums[ind]
    }
}

def vec1 = new Vector(nums: [1,2,3])
def vec2 = new Vector(nums: [5,6,7])

println vec1 + vec2
println "The first member of vec1 is ${vec1[0]}"

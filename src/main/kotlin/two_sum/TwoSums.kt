package two_sum

class TwoSums {
    fun bruteForceApproach(nums : IntArray, target: Int):IntArray{
        for((i1,v1) in nums.withIndex()){
            for((i2,v2) in nums.withIndex()){
                if(target - v1 == v2 && i1 != i2) return intArrayOf(i1,i2)
            }
        }
        throw IllegalStateException("Only one valid answer not exists")

    }
}
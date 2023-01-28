package two_sum

class UsingMap {
    fun twoSum(nums : IntArray, target : Int): IntArray{
        val map = mutableMapOf<Int, Int>()
        for ((i1,v1) in nums.withIndex()){
            map[target - v1]?.let {
                if(i1 != it) return intArrayOf(i1 , it)
            }
            map[v1] = i1
        }
        throw IllegalStateException("Only one answer wasn't found...")
    }
}
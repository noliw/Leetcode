class Solution {
    fun sortedSquares(nums: IntArray): IntArray {
        if(nums.isEmpty()) return intArrayOf()

        var left = 0
        var right = nums.size - 1
        var result = mutableListOf<Int>()

        while (left <= right){
            var leftSqr = nums[left] * nums[left]
            var rightSqr = nums[right] * nums[right]
            when{
                 leftSqr < rightSqr -> {
                    result.add(0, rightSqr)
                    right--
                }
                else -> {
                     result.add(0, leftSqr)
                    left++
                }
            } 
        }

        return result.toIntArray()
        
    }
}
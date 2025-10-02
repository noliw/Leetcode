class Solution {
     fun sortedSquares(nums: IntArray): IntArray {
        var left = 0
        var right = nums.size - 1
        val result = IntArray(nums.size)
        var pos = nums.size - 1   // fill result from the end

        while (left <= right) {
            val leftSquare = nums[left] * nums[left]
            val rightSquare = nums[right] * nums[right]

            if (leftSquare > rightSquare) {
                result[pos] = leftSquare
                left++
            } else {
                result[pos] = rightSquare
                right--
            }
            pos--
        }
        return result
    }
    
}
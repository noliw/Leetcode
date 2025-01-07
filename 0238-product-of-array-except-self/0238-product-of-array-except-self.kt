/* 
!. Given
    - an integer array called nums
2. What do we need to do to that array:
    - for each element in nums, we need to multiply all the other elements and add the result to an array
3. return:
    - return an array called answer that has all the products


*/

class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val res = IntArray(nums.size) { 1 }

        var prefix = 1
        for (i in nums.indices) {
            res[i] = prefix
            prefix *= nums[i]
        }

        var postfix = 1
        for (i in nums.size - 1 downTo 0) {
            res[i] *= postfix
            postfix *= nums[i]
        }

        return res
    }
}
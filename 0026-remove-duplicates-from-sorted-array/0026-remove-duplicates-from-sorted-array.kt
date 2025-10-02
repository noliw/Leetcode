class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        if (nums.isEmpty()) return 0

    var L = 0
    for (R in 1 until nums.size) {
        if (nums[R] != nums[L]) {
            L++
            nums[L] = nums[R]
        }
    }
    return L + 1
        
    }
}
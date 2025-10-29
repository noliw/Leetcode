class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var left = 1
    var right = 1
    var count = 1
    

    for (right in 1 until nums.size) {
        if (nums[right] == nums[right - 1]) {
            count += 1
        } else {
            count = 1
        }

        if (count <= 2) {
            nums[left] = nums[right]
            left += 1
        }
    }

    return left
    }
}
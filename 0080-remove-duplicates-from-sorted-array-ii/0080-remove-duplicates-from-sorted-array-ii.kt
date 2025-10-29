class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        if(nums.size < 3) return nums.size
        var left = 2
        for (right in 2 until nums.size){
            if(nums[right] != nums[left - 2]){
                nums[left] = nums[right]
                left++
            }
        }
        return left
    }
}
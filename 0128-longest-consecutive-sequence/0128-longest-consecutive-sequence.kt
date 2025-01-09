/*
1. given:
    - unsorted array called nums
2. what do we need to do to the input:
    - find the longest consecutive element sequence in O(n)
3. what do we return:
    - return the lenght of it
    - 
 */


class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        val numSet = nums.toSet()
        var longest = 0

        for (num in numSet) {
            if ((num - 1) !in numSet) {
                var length = 1
                while ((num + length) in numSet) {
                    length++
                }
                longest = maxOf(longest, length)
            }
        }
        return longest
    }
}
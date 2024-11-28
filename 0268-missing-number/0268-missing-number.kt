/*
1. inputs: 
- we have an array of integers n with distinct numbers 
- the range in between [0, n]

2. find the missing number in that range
3. return that number 
*/
class Solution {
    fun missingNumber(nums: IntArray): Int {
        var n = nums.size
        var expectedSum = (0..n).sum()
        var actualSum = nums.sum()
        return expectedSum - actualSum
    }
}
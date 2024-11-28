/*
1. inputs: 
- we have an array of integers n with distinct numbers 
- the range in between [0, n]

2. find the missing number in that range
3. return that number 
*/
class Solution {
    fun missingNumber(nums: IntArray): Int {
        return (0..nums.size).sum() - nums.sum()
    }
}
/*
1. inputs:
    - 2D array nums
    - the elements in the subarray are:
        - positive
        - distinct
        - non-empty
2. what do we need to do to that input:
    - we need to find the numbers that are present in each subarray
3. what do we return:
    - we need to return list of integers sorted in ascending order
*/


class Solution {
    fun intersection(nums: Array<IntArray>): List<Int> {
       var numCount = mutableMapOf<Int, Int>().withDefault{ 0 }
       var ans = mutableListOf<Int>()
       for (subArrayIdx in nums){
            for (numIdx in subArrayIdx) { 
                numCount.put(numIdx, numCount.getValue(numIdx) + 1)
            }
       } 
       for ((key, value) in numCount) {
       if(value == nums.size){
            ans.add(key)
       }
       }
       ans.sort()
       return ans
    }
}
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
       var count = HashMap<Int, Int>()
        var answer = ArrayList<Int>()
        for(array in nums){
            for(x in array){
                count.put(x, count.getOrDefault(x, 0) + 1)
            }
        }
        for((key,value) in count){
            if(value==nums.size){
                answer.add(key)
            }
        }

        answer.sort()
        return answer;
    }
}
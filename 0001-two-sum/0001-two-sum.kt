
/*
1. What are our inputs:
- nums, array if integers IntArray nums
- target, an integer

2. What do we need to do to the inputs:
- go through nums and find two numbers that add up to the target


3. what do we return:
- return the indices of the two numbers 

 */

 /*
 straight forward approach would be to go through the entire list and find the numbers that add up to the target. teach number in the list would be the first number in the array. this means we might need nested loops the first loop will go throuh the first number and the inner loop would go through the rest of the list to find the target. this would be an O(n) * O(n) operation which is O(n^2) time complexity and an O(n) space complexity because the size of the space needed grows linearly as the size of the input increases 
 */

 /*
 instead we can use hashmap for a more efficient approach. Instead of re-checking previously seen elements, we can store their indices in a hash map and find the missing number instantly. Any operation on a hashmap is O(1) and going through the list would be O(n) so we would have a time and space complexity of O(n)
 */
 
 class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val seenNums = mutableMapOf<Int, Int>()

        for((index, num) in nums.withIndex()){
            val missingNum = target - num
            if(seenNums.containsKey(missingNum)){
                return intArrayOf(seenNums.getValue(missingNum), index)
            }

            seenNums[num] = index
        }

        return intArrayOf()
        
        
    }
}

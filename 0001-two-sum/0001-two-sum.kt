
/*
1. What are our inputs:
- an array of integers called nums
. a target int value 

2. What do we need to do to the inputs:
- we need to find a two numbers in the array that add up to the target


3. what do we return:
- we return the indices of those two arrays

 */

 /*
 straight forward approach would be starting with each number in the list iterate through the remaining elements and see if any of them match up to the target? This would involve a nested loop. the outter loop would go through i which is O(n) complexity and the second one would be would iterate through the remaining elements j and add see if I and j add up to the target. time complexity so the overall solution would be O(n) (for the outer loop) * O(n) for the inner loop = O(n^2) time complexity and since we are using our predefined variable their size only increases as the input increase we would have an O(n) space complexiy.

 The straightforward, brute-force approach involves using two loops to find the solution. For each number in the array, the outer loop iterates through each element \U0001d456, and for each \U0001d456 , the inner loop checks all the remaining elements \U0001d457 to see if their sum equals the target.
This means:
The outer loop runs O(n) times, where n is the size of the array.
The inner loop also runs O(n) times in the worst case for each iteration of the outer loop.
As a result, the time complexity is O(n)×O(n)=O(n^2).

In terms of space complexity, since we are not using any additional data structures beyond predefined variables, it is O(1). However, the space required to store the input array scales linearly with its size, so the overall space complexity would be O(n).
 */


 /*
Instead, we can use a hashmap for better efficiency. As we iterate through the array, we store each element’s value and its index in the hashmap. For each iteration, we calculate the missing number x by subtracting the current number from the target (x = target - currentNum).

If the missing number x is already in the hashmap, it means we've found the two numbers that add up to the target. In that case, we return the indices of [x (retrieved from the hashmap), the current number].

Time Complexity:
- O(n): We traverse the array once, and each lookup or insertion in the hashmap takes O(1) on average. Therefore, the total time complexity is linear with respect to the size of the array.

Space Complexity:
- O(n): In the worst case, we may need to store all n elements of the array in the hashmap, so the space complexity scales linearly with the input size. 
 */
 
 class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val seenNums = hashMapOf<Int, Int>()
        for((index, currNum) in nums.withIndex()){
            // calculate the missing number
            var x = target - currNum

            if(seenNums.contains(x)){
                return intArrayOf(seenNums.getValue(x), index)
            }
            seenNums[currNum] = index
        }
        return intArrayOf()
        
    }
}

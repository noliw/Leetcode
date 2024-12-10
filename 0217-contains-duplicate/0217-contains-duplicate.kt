/*
1. given:
- array of integers nums

2. check if the any num appears at least twice in the array

3. return true if it does

 */

 /*
 the straight forward approach would be starting with each number as the first starting point, we iterate through the remaining elements in the array to see if we have found a matching number. if so we do return true if not we return false. This would involve an outer loop that will iterate through each number as the first element with O(n) complexity and an inner loop the would iterate through the remaining elements with O(n) complexity. In the worst case scenario we are iterating over the array multiple times so O(n) * O(n) = O(n^2) 
  */

/*
instead we can use a hash map to keep track of each occurance of a number and return as soon as we were able to find a duplicate. for this we would need to iterate over the array once hence we would potentially end up with an O(n) time complexity
 */

 /*
 steps:
 - create a hash map to store the elements we've seen
 - loop through the entire array
    - check if the current number exists in the hashmap already (has been already seen), 
        - if it does return true
    - if the current element has not been seen
        - we will store the number as the key and a count as value
- if we go through the entire array without returning finding duplicates, we will return false
    
  */
class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
         val seen = HashSet<Int>()
        for (num in nums) {
            if (num in seen) {
                return true
            }
            seen.add(num)
        }
        return false
    }
}
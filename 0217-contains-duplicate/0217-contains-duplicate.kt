/*
1. given:

2. 

3. 

 */

 /*
 
  */

/*

 */

 /*
    
*/
class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        // Step 1: Create an empty set to store seen numbers
    val seen = mutableSetOf<Int>()
    
    // Step 2: Loop through each number in the array
    for (num in nums) {
        // Step 3: Check if the number is already in the set
        if (num in seen) {
            // If the number is found, return true
            return true
        }
        // Step 4: Add the number to the set
        seen.add(num)
    }
    
    // Step 5: If we reach here, no duplicates were found, so return false
    return false

    }
}
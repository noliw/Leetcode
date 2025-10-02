class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        // Step 1: Handle edge case - if array has 2 or fewer elements
    // All elements are valid (can't have more than 2 of anything yet)
    if (nums.size <= 2) return nums.size
    
    // Step 2: Initialize uniquePosition at index 2
    // The first two elements are always kept (they can't violate the "at most 2" rule)
    var uniquePosition = 2
    
    // Step 3: Start scanning from index 2 with our current pointer
    // We skip the first two because they're automatically valid
    for (current in 2 until nums.size) {
        
        // Step 4a: Compare current element with element TWO positions back in result
        // If they're different, we haven't placed this element twice yet
        when {
            nums[current] != nums[uniquePosition - 2] -> {
                // Step 4b: This element is valid - place it at uniquePosition
                nums[uniquePosition] = nums[current]
                
                // Step 4c: Move uniquePosition forward for next valid element
                uniquePosition++
            }
            // If they're the same, we already have 2 copies - skip this duplicate
        }
    }
    
    // Step 5: Return uniquePosition, which equals count of valid elements
    return uniquePosition
    }
}
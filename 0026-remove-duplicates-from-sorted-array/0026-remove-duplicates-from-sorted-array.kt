class Solution {
    fun removeDuplicates(nums: IntArray): Int {
    // Step 1: Handle empty array edge case
    if (nums.isEmpty()) return 0

    // Step 2: Initialize the first pointer (left) at index 0
    var left = 0

    // Step 3: Start scanning from the second element (index 1)
    for (right in 1 until nums.size) {

        // Step 4: If we find a new unique number
        if (nums[right] != nums[left]) {
            // Step 5: Move left forward to the next position
            left++

            // Step 6: Copy the unique number to the next available slot
            nums[left] = nums[right]
        }
    }

    // Step 7: The number of unique elements is left + 1 (since index starts from 0)
    return left + 1
    }
}
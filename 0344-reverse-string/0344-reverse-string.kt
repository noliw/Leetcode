class Solution {
    fun reverseString(s: CharArray): Unit {
       // Step 1: Initialize two pointers
    // 'left' starts at the beginning (index 0)
    var left = 0
    // 'right' starts at the end (last index)
    var right = s.size - 1
    
    // Step 2: Continue swapping until the pointers meet
    while (left < right) {
        // Step 3: Temporarily store the left character
        val temp = s[left]
        
        // Step 4: Move the right character to the left position
        s[left] = s[right]
        
        // Step 5: Move the left character (stored in temp) to the right position
        s[right] = temp
        
        // Step 6: Move both pointers toward the center
        left++
        right--
    }
    // Step 7: No return needed; the array is modified in place
      
    }
}
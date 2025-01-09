/*
1. given:
    - unsorted array called nums
2. what do we need to do to the input:
    - find the longest consecutive element sequence in O(n)
3. what do we return:
    - return the lenght of it
    - 
 */


class Solution {
    fun longestConsecutive(numbers: IntArray): Int {
    val uniqueNumbers = numbers.toSet() // Store unique elements for quick lookup
    var longestStreak = 0 // Track the longest sequence length

    for (num in uniqueNumbers) {
        // Only start counting if it's the start of a sequence
        if ((num - 1) !in uniqueNumbers) {
            var currentNum = num
            var currentStreak = 1

            // Count all consecutive numbers
            while ((currentNum + 1) in uniqueNumbers) {
                currentNum++
                currentStreak++
            }

            // Update the longest sequence length
            longestStreak = maxOf(longestStreak, currentStreak)
        }
    }

    return longestStreak
}


}
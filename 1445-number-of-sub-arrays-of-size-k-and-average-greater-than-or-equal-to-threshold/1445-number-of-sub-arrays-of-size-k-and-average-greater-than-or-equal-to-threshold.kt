class Solution {
    fun numOfSubarrays(arr: IntArray, k: Int, threshold: Int): Int {
    
        // Step 0: Guard against impossible or nonsensical cases (k <= 0 or k > arr.size): return 0 directly
    if (k <= 0 || k > arr.size) return 0

    // Step 1: Convert threshold * k to Long to avoid overflow and to compare against a Long sum safely
    val target: Long = threshold.toLong() * k

    // Step 2: Prepare a running sum as Long to safely hold large sums
    var windowSum = 0L

    // Step 3: Build the initial window sum over the first k elements (indices 0..k-1)
    for (i in 0 until k) {
        // Step 3.1: Add each of the first k elements into the running sum
        windowSum += arr[i]
    }

    // Step 4: Initialize our count of valid windows (average >= threshold)
    var count = 0

    // Step 5: Check the very first window explicitly (we have its sum already)
    if (windowSum >= target) {
        // Step 5.1: If the sum is big enough, increment the count
        count++
    }

    // Step 6: Slide the window across the array from index k to arr.lastIndex
    for (i in k until arr.size) {
        // Step 6.1: Add the new entering element on the right (arr[i])
        windowSum += arr[i]
        // Step 6.2: Subtract the leaving element on the left (arr[i - k])
        windowSum -= arr[i - k]
        // Step 6.3: After updating the sum for this new window, compare against target
        if (windowSum >= target) {
            // Step 6.4: Count this window if it qualifies
            count++
        }
    }

    // Step 7: Return the total count of windows whose average >= threshold
    return count
    }
}
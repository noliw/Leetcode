class Solution {
    fun numOfSubarrays(arr: IntArray, k: Int, threshold: Int): Int {
        if (arr.size < k) return 0

        var count = 0
        var windowAvg = 0.0

        // Build the first window average
        for (i in 0 until k) {
            windowAvg += arr[i].toDouble() / k
        }

        // Slide the window
        for (right in k until arr.size) {
            if (windowAvg >= threshold) count++

            val left = right - k
            // remove outgoing element's contribution
            windowAvg -= arr[left].toDouble() / k
            // add new element's contribution
            windowAvg += arr[right].toDouble() / k
        }

        // Final window check
        if (windowAvg >= threshold) count++

        return count

    }
}
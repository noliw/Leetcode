class Solution {
    fun numOfSubarrays(arr: IntArray, k: Int, threshold: Int): Int {
    
        var currSum = 0.0
        for (i in 0 until k){
            currSum += arr[i]
        }

        var avgSum = currSum / k
        var count = 0
        if (avgSum >= threshold){
                count++
            }

        for (i in k until arr.size){
            
            avgSum += (arr[i] / k) - (arr[i - k] / k)
            if (avgSum >= threshold){
                count++
            }
        }
        return count
    }
}
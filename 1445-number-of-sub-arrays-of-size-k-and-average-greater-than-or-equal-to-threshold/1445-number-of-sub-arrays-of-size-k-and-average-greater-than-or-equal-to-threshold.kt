class Solution {
    fun numOfSubarrays(arr: IntArray, k: Int, threshold: Int): Int {
        if (k <= 0 || k > arr.size) return 0
       
        var avg = 0
        var count = 0
        for (i in 0 until k){
            avg += arr[i]
        }
        
        if(avg  >= threshold * k) count++

        for (i in k until arr.size){
            avg += arr[i] 
            avg -= arr[i - k]
            if(avg  >= threshold * k) count++
       
        }
        return count
     
    }
}
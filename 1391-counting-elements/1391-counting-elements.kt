/*
1. what is our input:
- array of integers
2. what do we need to do to that input?
- we need to find the number of elements x in the array that have x+1 in the array 
 */

class Solution {
    fun countElements(arr: IntArray): Int {
        var count = 0
        var hash = arr.toHashSet()
        for (x in arr){
            if (hash.contains(x+1)) count++
        }
        return count
    }
}

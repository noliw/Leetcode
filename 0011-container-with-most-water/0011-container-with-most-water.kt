class Solution {
    fun maxArea(height: IntArray): Int {
        var left = 0
        var right = height.size - 1
        var maxArea = 0

        while(left < right){
            val currArea = minOf(height[left], height[right]) * (right - left)
            maxArea = maxOf(currArea, maxArea)

            if( height[left] < height[right]){
                left++
            } else {
                 right--
            }
            maxArea = maxOf(maxArea, currArea)
        }
        return maxArea
    }
}
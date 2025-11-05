class Solution {
    fun maxArea(height: IntArray): Int {
        if(height.isEmpty()) return 0
        var left = 0
        var right = height.size - 1
        var maxArea = 0

        while (left < right){
            val width = right - left
            val length = if (height[left] < height[right]) height[left] else height[right]
            var currArea = width * length
            maxArea = maxOf(maxArea, currArea)

             if(height[left] > height[right]) right-- else left++
        }

        return maxArea
    }
}
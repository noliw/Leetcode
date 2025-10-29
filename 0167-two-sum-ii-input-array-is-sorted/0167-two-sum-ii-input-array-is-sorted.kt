class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        if (numbers.isEmpty()) intArrayOf()
       var left = 0
       var right = numbers.size - 1

       while (left <= right){
        when {
            numbers[left] + numbers[right] == target -> return intArrayOf(left + 1, right + 1)
            numbers[left] + numbers[right] > target -> right--
            else -> left++
        }



       } 
       
        return intArrayOf()
    }
}
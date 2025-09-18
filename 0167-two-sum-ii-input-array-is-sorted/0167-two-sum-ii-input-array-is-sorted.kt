class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var left = 0
        var right = numbers.size - 1

        while (left < right){
            val sum = numbers[left] + numbers[right]
            when {
                sum > target -> right--
               sum < target -> left++
                else -> return intArrayOf(left + 1, right + 1)
            }
        }
        return intArrayOf()
    }
}
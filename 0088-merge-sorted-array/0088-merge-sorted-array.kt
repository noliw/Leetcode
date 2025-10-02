class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var i = m - 1        // last valid element in nums1
    var j = n - 1        // last element in nums2
    var k = m + n - 1    // last position in nums1 (including 0s)

    while (i >= 0 && j >= 0) {
        if (nums1[i] > nums2[j]) {
            nums1[k] = nums1[i]
            i--
        } else {
            nums1[k] = nums2[j]
            j--
        }
        k--
    }

    // If any nums2 elements remain, copy them
    while (j >= 0) {
        nums1[k] = nums2[j]
        j--
        k--
    }
    }
}
/*189. Rotate Array
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
class Solution {
    fun rotate(nums: IntArray, k: Int): Unit {
        val result = nums.copyOf()
        var rotate = k
        if (k > nums.size) {
            rotate =  k % nums.size
        }

        var index = nums.size - rotate

        for (i in nums.indices) {
            nums[i] = result[(index + i) % nums.size]
        }

        for (i in nums.indices) {
            print(nums[i])
        }
    }
}*/

/*
977. Squares of a Sorted Array
class Solution {
    fun sortedSquares(nums: IntArray): IntArray {
        for(i in nums.indices) {
            nums[i] = nums[i] * nums[i]
        }

        var tmp = 0
        for (i in nums.indices) {
            for (j in i..nums.size) {
                if (nums[i] > nums[j]) {
                    tmp = nums[i]
                    nums[i] = nums[j]
                    nums[j] = tmp
                }
            }
        }
        println(nums)
        return nums
    }
}*/


/*class Solution {
    fun search(nums: IntArray, target: Int): Int {
        nums.forEachIndexed { index, i -> if(i == target) return index}
        return -1
    }
    fun search2(nums: IntArray, target: Int): Int {
        for(i in 0..nums.size) {
            if(nums[i] == target) {
                return i
            }
        }
        return -1
    }
}*/

// 278. first bad version
/* The isBadVersion API is defined in the parent class VersionControl.
      fun isBadVersion(version: Int) : Boolean {} */
/*class Solution {
    fun firstBadVersion(n: Int) : Int {
        var start = 1
        var end = n
        var mid = (start+end) / 2
        if(isBadVersion(mid) == true && n == 1) {
            return mid
        } else {

        }

        while(mid + 1 <= end) {
        if(isBadVersion(mid) == true) {
            end = mid
            mid = (start+end)/2
        } else {
            start = mid
            mid = (start+end) /2
        }
        }



        if(n == 1) {
             return 1
        }
        var m = n.toDouble()
        m = ceil(m/2)
        if(isBadVersion(m) == true) {
            return m
        }else {

        }

    }
}*/

// 35. Search Insert Position
/*class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        for (i in nums.indices) {
            if (nums[i] == target) {
                return i
            }
            if (nums[i] > target) {
                return i
            }
        }
        return nums.size
    }
}*/

class level1 {
    class Solution {
        // 1480. Running Sum of 1d Array
/*        fun runningSum(nums: IntArray): IntArray {
            val result = IntArray(nums.size)
            var previous = 0

            nums.forEachIndexed { index, i ->
                previous += i
                result[index] = previous
            }

            for(i in result.indices){
                println(result[i])
            }
            return result
        }*/
        // 724. Find Pivot Index
        /*fun pivotIndex(nums: IntArray): Int {
            var left = 0
            var right = nums.sum()
            var pivot = 0

            nums.forEachIndexed { index, value ->
                right -= nums[index]
                if(left == right) {
                    return pivot
                }
                left += nums[index]
                pivot++
            }
            return -1
        }*/

        //205. Isomorphic Strings
/*        fun isIsomorphic(s: String, t: String): Boolean {
            val charArrs = s.toCharArray()
            val charArrt = t.toCharArray()
            val arrs = IntArray(128)
            val arrt = IntArray(128)

            for (i in charArrs.indices) {
                if (arrs[charArrs[i].code] == 0 && arrt[charArrt[i].code] == 0) {
                    arrs[charArrs[i].code] = charArrt[i].code
                    arrt[charArrt[i].code] = charArrs[i].code
                } else if (arrs[charArrs[i].code] != charArrt[i].code) {
                    print("false")
                    return false
                } else if (arrt[charArrt[i].code] != charArrs[i].code) {
                    print("false")
                }
            }
            print("true")
            return true
        }*/

        //392. Is Subsequence
/*        fun isSubsequence(s: String, t: String): Boolean {
            var j = 0
            if(s.isEmpty()) return true
            for (i in t.indices) {
                if(t[i] == s[j]) {
                    j++
                }
                if(j == s.length){
                    return true
                }
            }

            return false
        }*/

        /**
         * Example:
         * var li = ListNode(5)
         * var v = li.`val`
         * Definition for singly-linked list.
         * class ListNode(var `val`: Int) {
         *     var next: ListNode? = null
         * }
         */
        /*fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {

        }*/

    }

}

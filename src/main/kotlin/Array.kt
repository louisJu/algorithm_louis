import kotlin.math.pow

// 02. Best time to buy and sell
/*
class Solution {
    fun maxProfit(prices: IntArray): Int {
        var result = 0
        var i = 0
        var j = i + 1
        if (prices.size == 1) {
            return result
        }

        while (j <= prices.size - 1) {
            if (prices[i] > prices[j]) {
                i = j
                j += 1
            } else if (j < prices.size - 1 && prices[j] > prices[j + 1]) {
                result += prices[j] - prices[i]
                i = j + 1
                j = i + 1
            } else {
                if (j == prices.size - 1) {
                    result += prices[j] - prices[i]
                }
                j += 1
            }
        }
        return result
    }
}
*/

// 03. Rotated Arrary
/*class Solution {
    fun rotate(nums: IntArray, k: Int) {
        val result = nums.copyOf()
        var i = 0
        while (i < nums.size) {
            nums[(k + i) % nums.size] = result[i]
            i++
        }
    }
}*/

/*// 04. contain duplicate
class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
*//*        var maxNums = 0
        for(i in nums.indices) {
            if(nums[i] > maxNums) {
                maxNums = nums[i]
            }
        }
        val resultArr = IntArray(maxNums)

        for(i in nums.indices) {
            resultArr[nums[i]] += 1
            if(resultArr[nums[i]] > 1) {
                return true
            }
        }
        return false*//*
        //val copyNums = nums.copyOf()

            for(i in nums.indices) {
                for(j in i+1 until nums.size) {
                    if(nums[i] == nums[j]){
                        return true
                    }
                }
            }
            return false
        }
    }*/

//성공!

/*class Solution {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        nums1.sort()
        nums2.sort()

        val small: IntArray
        val large: IntArray

        if (nums1.size > nums2.size) {
            small = nums2
            large = nums1
        } else {
            small = nums1
            large = nums2
        }
        val result = mutableListOf<Int>()
        var i = 0
        var j = 0
        while (i < small.size) {
            if (small[i] == large[j]) {
                result.add(small[i])

                i++
                j++
                continue
            }
            if (small[i] > large[j]) {
                j++
                continue
            }
            if (small[i] < large[j]) {
                i++
                continue
            }
        }
        for(element in result) {
            println(element)
        }
        return result.toIntArray()
    }
}
 */
/*class Solution {

    *//*fun plusOne(digits: IntArray): IntArray {
        var i = 0
        var j = digits.size - 1
        var sum = 0.0
        while(i < digits.size) {
            sum += digits[i++] * 10.0.pow(j--)
        }
        println(sum)

        var k = 0
        var num = (sum+1).toLong()
        while(num > 0) {
            num /= 10
            k++
        }
        val result= IntArray(k)
        var num2 = (sum+1).toLong()
        println(num2)
        var y = 0
        k -= 1
        while(k >= 0) {
            result[y++] = (num2/10.0.pow(k)).toInt()
            num2 = (num2%10.0.pow(k--)).toLong()
        }
        for(element in result) {
            println(element)
        }

        return result
    }*//*
    fun plusOne(digits: IntArray): IntArray {
        val copyDigits = digits.copyOf()
        var i = digits.size - 1
        while(digits[i] + 1 == 10) {
            if(i == 0) {
                var result = IntArray(digits.size+1)
                result[0] = 1
                return result
            }
            copyDigits[i] = 0
            i--
        }
        copyDigits[i] += 1

        for(element in copyDigits) {
            println(element)
        }

        return copyDigits
    }
}*/

/*283. Move Zeroes
class Solution {
    fun moveZeroes(nums: IntArray) {
        var tmp: Int
        for(i in 0 until nums.size-1) {
            for(j in i+1 until nums.size) {
                if(nums[i] == 0 && nums[j] != 0) {
                    tmp = nums[j]
                    nums[j] = nums[i]
                    nums[i] = tmp
                }
            }
        }
    }
}*/

// 167. Two Sum II - Input Array Is Sorted
/*
class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        val result = IntArray(2)
        for (i in 0 until numbers.size -1) {
            for ( j in i+1 until numbers.size) {
                if(numbers[i] + numbers[j] == target) {
                    result[0] = i+1
                    result[1] = j+1
                    break;
                }
            }
        }
        for (i in result.indices) {
            print(result[i])
        }
return result
    }
}*/
// 344. Reverse String
/*class Solution {
    fun reverseString(s: CharArray) {
        var tmp: Char
        for (i in 0 until s.size / 2) {
            tmp = s[i]
            s[i] = s[s.lastIndex - i]
            s[s.lastIndex - i] = tmp
        }
        for (i in s.indices) {
            println(s[i])
        }
    }
}*/

// 557. Reverse Words in a String III
/*
class Solution {
    fun reverseWords(s: String): String {
        var result = mutableListOf<String>()
        val splitString = s.split(' ')

        for (i in splitString.indices) {
            var charArr = splitString[i].toCharArray()
            var tmp: Char
            for (j in 0 until charArr.size / 2) {
                tmp = charArr[j]
                charArr[j] = charArr[charArr.lastIndex - j]
                charArr[charArr.lastIndex - j] = tmp
            }
            println(String(charArr))
            result.add(String(charArr))
        }
        result.joinToString(" ")

        print(result.joinToString(" "))
        return result.joinToString(" ")
    }
}*/

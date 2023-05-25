import java.util.*

class BucketPlace {
    // #1 - C
/*    fun solution(s: String): Boolean {
        var answer: Boolean = true
        var stack = Stack<Char>()
        for (i in s.indices) {
            if (stack.isNotEmpty() && (
                (s[i] == ')' && stack.peek() == '(') ||
                (s[i] == ']' && stack.peek() == '[') ||
                (s[i] == '}' && stack.peek() == '{')
                        )
            ) {
                stack.pop()
            } else {
                stack.push(s[i])
            }
        }
        if (!stack.isEmpty()) {
            answer = false
        }

        return answer
    }*/
    // #2 -C
/*    fun solution(numbers: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        val tmp = mutableListOf<Int>()
        val MAX = 10
        var addNum = 1


*//*        for (i in numbers.count() downTo 1) {
            var result = numbers[i-1] + addNum
            if (result == 10) {
                addNum = 1
                tmp.add(0)
                if(i == 1) {
                    tmp.add(addNum)
                }
            } else {
                tmp.add(result)
                addNum = 0
            }
        }*//*
        for (i in numbers.lastIndex downTo 0) {
            val result = numbers[i] + addNum
            tmp.add(result % MAX)
            addNum = result / 10
            if (i == 0 && addNum == 1) {
                tmp.add(addNum)
            }
*//*            if (result == 10) {
                addNum = 1
                // tmp.add(0)
                if (i == 1) {
                    tmp.add(addNum)
                }
            } else {
                // tmp.add(result)
                addNum = 0
            }*//*
        }
        answer = tmp.reversed().toIntArray()
        return answer
    }*/

    // #3 - 효율성 탈락
/*    fun solution(numbers: IntArray): Int {
        var answer: Int = 0
        val MOD = 1000000007
        val reversedNumbers = mutableListOf<Int>()
        for (i in numbers.indices) {
            reversedNumbers.add(i, reverse(numbers[i]))
        }

        for (i in 0 until numbers.count()) {
            for (j in i + 1 until numbers.count()) {
                if ((numbers[i] + reversedNumbers[j]) % MOD
                    == (numbers[j] + reversedNumbers[i]) % MOD) {
                    answer++
                }
            }
        }
        return answer
    }

    private fun reverse(num: Int): Int {
        var tmp = num
        var reversed = 0

        while (tmp != 0) {
            val digit = tmp % 10
            reversed = reversed * 10 + digit
            tmp /= 10
        }
        return reversed
    }*/

    // #4
 /*   fun solution(inputs: Array<String>, pattern: String): List<Boolean> {
        var answer = mutableListOf<Boolean>()
        for (i in inputs.indices) {
            answer.add(checkPattern(inputs[i], pattern))
        }
        return answer
    }
    private fun checkPattern(input: String, pattern: String): Boolean {
*//*        var i = 0
        for (j in input.indices) {
            if (input[j] == pattern[i]) {
                i++
            }
            if (i == pattern.length) {
                return true
            }
        }
        return false*//*
        var result = ""
        var j = 0
        for (i in pattern.indices) {
            while(j < input.length) {
                if (input[j] == pattern[i]) {
                    result = result.plus(input[j])
                    j++
                    break
                } else if (input[j].isUpperCase()) {
                    return false
                }
                j++
            }

        }


        if (result == pattern) {
            return true
        }
        return false
    }*/
}

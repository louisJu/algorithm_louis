class leetCode75 {
/*    fun longestPalindrome(words: Array<String>): Int {
        val resultHashMap = hashMapOf<String, Int>()
        var result = 0
        words.forEach { word ->
            if (resultHashMap[word.reversed()] ?: 0 >= 1) {
                resultHashMap[word.reversed()] = resultHashMap[word.reversed()]!! - 1
                result += 4
            } else {
                resultHashMap[word] = resultHashMap[word]?.let {
                    it + 1
                } ?: 1
            }
        }
        resultHashMap.forEach {
            if (it.key[0] == it.key[1] && it.value == 1) {
                return result + 2
            }
        }
        return result
    }*/

/*    fun leastInterval(tasks: CharArray, n: Int): Int {
        var result = 0
        tasks.forEach {
            result++
        }

    }*/


}

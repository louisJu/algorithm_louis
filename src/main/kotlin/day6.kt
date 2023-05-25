// 3. Longest Substring Without Repeating Characters

/*
class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var maxLength = 0
        val map = mutableMapOf<Char, Int>()
        var start = 0

        for(i in s.indices) {
            if(map.contains(s[i])) {
                start = map[s[i]]!! + 1
            }
            map[s[i]] = i
        }

    }
}*/

// 567. Permutation in String
class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {
        var s1Set = s1.toSet()
        var count = 0
        var start = 0

        while(start < s2.length) {
            for (i in start until s2.length) {
                if (s1Set.contains(s2[i])) {
                    count++
                    s1Set = s1Set.minus(s2[i])
                } else if (s1.contains(s2[i]) && count != 0) {
                    start = i - 1
                    s1Set = s1.toSet()
                    break
                } else {
                    count = 0
                    s1Set = s1.toSet()
                }
                if (count == s1.length) {
                    return true
                }
                start++
            }
        }
        return false
    }
}

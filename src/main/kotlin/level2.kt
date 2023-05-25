class level2 {
    /*class Solution {
        fun isHappy(n: Int): Boolean {
            var resultList = mutableListOf<Int>()
            var result = calculateResult(n)
            while(result != 1) {
                resultList.add(result)
                result = calculateResult(result)
                if(resultList.contains(result)) {
                    println("false")
                    return false
                }
            }
            println("true")
            return true
        }

        private fun calculateResult(
            n: Int
        ): Int {
            var result = 0
            var intList = mutableListOf<Int>()
            var tmp = n
            tmp = n
            while (tmp >= 10) {
                intList.add(tmp%10)
                tmp /=10
            }
            intList.add(tmp)

            for (i in intList.indices) {
                result += intList[i] * intList[i]
            }
            return result
        }
    }*/

    /*class Solution {
        fun spiralOrder(matrix: Array<IntArray>){
            var xMin = 0
            var xMax = matrix[0].size - 1
            var yMin = 0
            var yMax = matrix.size - 1
            var result = mutableListOf<Int>()

            var x = xMin
            var y = yMin
            while ((xMin <= xMax && yMin <= yMax)) {
                if (x == xMin && y == yMin && (xMin <= xMax && yMin <= yMax) ) {
                    for (i in xMin..xMax) {
                        result.add(matrix[yMin][i])
                    }
                    x = xMax
                    yMin++
                    y = yMin
                }

                if (x == xMax && y == yMin && (xMin <= xMax && yMin <= yMax)) {
                    for (j in yMin..yMax) {
                        result.add(matrix[j][xMax])
                    }
                    y = yMax
                    xMax--
                    x = xMax
                }

                if (x == xMax && y == yMax && (xMin <= xMax && yMin <= yMax) ) {
                    for (i in xMax downTo xMin) {
                        result.add(matrix[yMax][i])
                    }
                    x = xMin
                    yMax--
                    y = yMax
                }

                if (x == xMin && y == yMax && (xMin <= xMax && yMin <= yMax)) {
                    for (j in yMax downTo yMin) {
                        result.add(matrix[j][xMin])
                    }
                    y = yMin
                    xMin++
                    x = xMin
                }
            }

            for (i in result.indices) {
                print("${result[i]}, ")
            }
        }
    }*/
}

package kotlin_pj.programmers.level0.basictraining

class MixStr {
    class Solution {
        fun solution(str1: String, str2: String): String {
            var answer: String = ""
            for (i in 0 until str1.length + str2.length) {
                if (i % 2 == 0) {
                    answer += str1[i / 2]
                } else {
                    answer += str2[i / 2]
                }
            }
            return answer
        }
    }
}

fun main() {
    val input = readln().split(" ")
    val str1 = input[0]
    val str2 = input[1]
    println(MixStr.Solution().solution(str1, str2))
}
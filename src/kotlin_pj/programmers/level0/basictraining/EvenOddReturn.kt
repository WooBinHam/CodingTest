package kotlin_pj.programmers.level0.basictraining

class EvenOddReturn {
    fun solution(n: Int): Int {
        var answer: Int = 0
        if (n % 2 == 0) {
            for (i in 0..n) {
                if (i % 2 == 0) {
                    answer += i * i
                }
            }
            return answer
        } else {
            for (i in 0..n) {
                if (i % 2 != 0) {
                    answer += i
                }
            }
            return answer
        }
    }
}

fun main() {
    val input = readln().toInt()
    println(EvenOddReturn().solution(input))
}
package kotlin_pj.programmers.level0.basictraining

class MultiplyStr {
    fun solution(my_string: String, k: Int): String {
        var answer: String = ""
        for (i in 0 until k) {
            answer += my_string
        }
        return answer
    }
}

fun main() {
    val input = readln().split(" ")
    val my_string = input[0]
    val k = input[1].toInt()
    println(MultiplyStr().solution(my_string, k))
}
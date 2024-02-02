package kotlin_pj.programmers.level0.basictraining

class DuplicateStr {
    fun solution(my_string: String, overwrite_string: String, s: Int): String {
        var answer: String = ""
        for (i in 0 until s) {
            answer += my_string[i]
        }
        answer += overwrite_string
        for (i in s + overwrite_string.length until my_string.length) {
            answer += my_string[i]
        }
        my_string.replaceRange(s, s + overwrite_string.length, overwrite_string)
        return my_string
    }

    fun solution2(my_string: String, overwrite_string: String, s: Int): String =
        my_string.replaceRange(s, s + overwrite_string.length, overwrite_string)
}

fun main() {
    val solutionClass = DuplicateStr()
    val input = readln().split(" ")
    val my_string = input[0]
    val overwrite_string = input[1]
    val s = input[2].toInt()
    println("$my_string, $overwrite_string, $s")
    println("answer: ${solutionClass.solution2(my_string, overwrite_string, s)}")
}
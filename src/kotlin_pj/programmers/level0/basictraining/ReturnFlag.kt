package kotlin_pj.programmers.level0.basictraining

class ReturnFlag {
    fun solution(a: Int, b: Int, flag: Boolean): Int = if (flag) a + b else a - b
}

fun main() {
    val input = readln().split(" ")
    val a = input[0].toInt()
    val b = input[1].toInt()
    val flag = input[2].toBoolean()
    println(ReturnFlag().solution(a, b, flag))
}
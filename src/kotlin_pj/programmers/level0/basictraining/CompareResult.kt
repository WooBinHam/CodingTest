package kotlin_pj.programmers.level0.basictraining

import kotlin.math.max

class CompareResult {
    fun solution(a: Int, b: Int): Int {
        val ab = (a.toString() + b.toString()).toInt()
        val cal = a * b * 2
        return max(ab, cal)
    }
}

fun main() {
    val input = readln().split(" ")
    val a = input[0].toInt()
    val b = input[1].toInt()
    println(CompareResult().solution(a, b))
}
package kotlin_pj.programmers.level0.basictraining

import kotlin.math.max

class AddBigger {
    fun solution(a: Int, b: Int): Int {
        val ab = (a.toString() + b.toString()).toInt()
        val ba = (b.toString() + a.toString()).toInt()
        return max(ab, ba)
    }
}

fun main() {
    val input = readln().split(" ")
    val a = input[0].toInt()
    val b = input[1].toInt()

    println(AddBigger().solution(a, b))
}
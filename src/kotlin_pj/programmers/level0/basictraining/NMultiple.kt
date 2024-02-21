package kotlin_pj.programmers.level0.basictraining

class NMultiple {
    fun solution(num: Int, n: Int): Int = if (num % n == 0) 1 else 0
}

fun main() {
    val input = readln().split(" ")
    val num = input[0].toInt()
    val n = input[1].toInt()
    println(NMultiple().solution(num, n))
}
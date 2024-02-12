package kotlin_pj.programmers.level0.basictraining

class CommonMultiple {
    fun solution(number: Int, n: Int, m: Int): Int = if (number % n == 0 && number % m == 0) 1 else 0
}

fun main() {
    val input = readln().split(" ")
    val number = input[0].toInt()
    val n = input[1].toInt()
    val m = input[2].toInt()
    println(CommonMultiple().solution(number, n, m))
}
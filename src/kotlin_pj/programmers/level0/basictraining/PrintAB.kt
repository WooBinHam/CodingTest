package kotlin_pj.programmers.level0.basictraining

fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map(String::toInt)
    println("a = $a")
    println("b = $b")
}
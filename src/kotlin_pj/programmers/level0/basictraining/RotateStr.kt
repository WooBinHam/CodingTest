package kotlin_pj.programmers.level0.basictraining

fun main(args: Array<String>) {
    val s1 = readLine()!!
    s1.toCharArray().forEach {
        println(it)
    }
    s1.map {
        println(it)
    }
}
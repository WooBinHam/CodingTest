package kotlin_pj.programmers.level0.basictraining

fun main(args: Array<String>) {
    val s1 = readLine()!!
    var answer = ""
    for (c in s1) {
        if (c.isLowerCase()) answer += c.uppercaseChar()
        else answer += c.lowercaseChar()
    }
    println(answer)

    s1.map {
        if (it.isLowerCase()) it.uppercaseChar()
        else it.lowercaseChar()
    }.joinToString("").also { println(it) }
}
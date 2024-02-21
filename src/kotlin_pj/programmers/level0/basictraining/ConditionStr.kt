package kotlin_pj.programmers.level0.basictraining

class ConditionStr {
    fun solution(ineq: String, eq: String, n: Int, m: Int): Int {
        return when (eq) {
            "=" -> {
                when (ineq) {
                    "<" -> return if (n <= m) 1 else 0
                    ">" -> return if (n >= m) 1 else 0
                    else -> -1
                }
            }

            "!" -> {
                when (ineq) {
                    "<" -> return if (n < m) 1 else 0
                    ">" -> return if (n > m) 1 else 0
                    else -> -1
                }
            }

            else -> -1
        }
    }
}

fun main() {
    val input = readln().split(" ")
    val ineq = input[0]
    val eq = input[1]
    val n = input[2].toInt()
    val m = input[3].toInt()
    println(ConditionStr().solution(ineq, eq, n, m))
}
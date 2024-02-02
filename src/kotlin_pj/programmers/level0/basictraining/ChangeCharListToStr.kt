package kotlin_pj.programmers.level0.basictraining

class ChangeCharListToStr {
    fun solution(arr: Array<String>): String {
        var answer: String = ""
        arr.forEach { char ->
            answer += char
        }
        return answer
    }

    fun solution2(arr: Array<String>): String = arr.joinToString("")
}

fun main() {
    val charList = ArrayList<String>()
    charList.add("a")
    charList.add("b")
    charList.add("c")
    println(charList)
    println(ChangeCharListToStr().solution2(charList.toTypedArray()))
}
package _2015

class Day01 {
    private val content = this::class.java
        .getResourceAsStream("/2015/day01.txt")
        ?.bufferedReader()
        ?.readLine()

    fun firstStar(): Int {
        var counter = 0
        content!!.forEach { c -> if (c == '(') counter++ else counter-- }
        return counter
    }

    fun secondStar(): Int {
        var counter = 0

        content!!.forEachIndexed{index, c ->
            if (c == '(') counter++ else counter--
            if (counter < 0) return index + 1
        }
        return 0
    }
}

fun main() {
    val d = Day01()
    println(d.firstStar())
    println(d.secondStar())
}
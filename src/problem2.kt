fun fibonacci() =
    generateSequence(Pair(0, 1)) { Pair(it.second, it.first + it.second) }.map { it.first }

fun problem2() =
    fibonacci()
        .takeWhile { it < 4_000_000 }
        .filter { (it % 2 == 0) }
        .sum()

fun main(args : Array<String>) {
    println(problem2())
}
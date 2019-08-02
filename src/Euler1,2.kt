fun divisibility() = (1..1000)
            .filter { it % 5 == 0 || it % 3 == 0 }
            .reduce { acc, i ->  acc + i }

fun fibonacciSeq() = generateSequence(Pair(0, 1)) { Pair(it.second, it.first + it.second) }
        .map { it.first }

fun fibonacci() = fibonacciSeq()
        .takeWhile { it < 4000000 }
        .filter { it % 2 == 0}
        .sum()

fun main(args : Array<String>) {
    println(divisibility())
    println(fibonacci())
}

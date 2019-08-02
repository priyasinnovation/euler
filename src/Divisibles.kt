
fun divisibility() = (1..1000)
            .filter { it % 5 == 0 || it % 3 == 0 }
            .reduce { acc, i ->  acc + i}

fun main(args : Array<String>) {
    println(divisibility())
}
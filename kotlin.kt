fun main(args: Array<String>) {
    (1..100).forEach {
        when (0) {
            it % 3 -> println("Fizz${if (it % 5 == 0) "Buzz" else ""}")
            it % 5 -> println("Buzz")
            else -> println(it)
        }
    }
}

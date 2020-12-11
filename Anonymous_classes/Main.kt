class Main {

}

fun main(args: Array<String>) {
    val bear = object : Animal("Camembear") {
        override fun makeSound() {
            println("ROOOAR!!!")
        }
    }

    bear.makeSound()
}
fun Int.isOdd(): Boolean {
    return this % 2 == 1
}

fun isEven(number: Int = 10): Boolean {
    return number % 2 == 0
}

fun print10Numbers() {
    for (i in 1..10) {
        println(i)
    }
}


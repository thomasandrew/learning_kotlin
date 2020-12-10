class Main {

}

fun main(args: Array<String>) {
  //val x = isEven(5)
    val x = isEven()
    val y = isEven(number = 5)
    val z = 3
    println(x)
    println(y)
    println(z.isOdd())
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


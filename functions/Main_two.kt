class Main {

}

fun main(args: Array<String>) {
  //val x = isEven(5)
    val x = isEven()
    val y = isEven(number = 5)
    println(x)
    println(y)
}

/*fun isEven(number: Int): Boolean {
    return number % 2 == 0
}
*/

fun isEven(number: Int = 10): Boolean {
    return number % 2 == 0
}

fun print10Numbers() {
    for (i in 1..10) {
        println(i)
    }
}


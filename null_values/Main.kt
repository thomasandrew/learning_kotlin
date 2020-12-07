class Main {

}

fun main(args: Array<String>) {
    val number1 = readLine() ?: "0"
    val number2 = readLine() ?: "0" // Use this insted of(!!)
    val result = number1.toInt() + number2.toInt() // i can use (!!) like this number1!!.toInt()
    println(result)
}

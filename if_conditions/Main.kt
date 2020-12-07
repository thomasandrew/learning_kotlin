class Main {

}

fun main(args: Array<String>) {
    val x = 1 + 3
    if(x == 2) {
        println("x is 2")
    } else if(x == 3) {
        println("x is 3")
    } else {
        println("x is not 2 or 3")
    }
    val y = if(x == 2) 2 else 3
    println(y)
}

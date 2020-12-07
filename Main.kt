class Main {

}

val k:Int = 4
val o = 3
val t:Double = 9.0

// Mutable Variables
var l = 10
var i = 11
var n:Int = 3
var count:Int = 0

fun mult(a:Int, b:Int):Int {
    count = count + 1
    return a * b
}

fun hi(name:String) = "Hi ${name}"

fun main(args: Array<String>) {
    println(mult(4, 5))
    println("The count is ${count}")
    println(hi("Thomas"))
}
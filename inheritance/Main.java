class Main {

}

fun main(args: Array<String>) {
  //val dog = Animal("Dog")
    val dog = Dog()
    dog.bark()
    val cat = Cat()
    cat.meow()
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


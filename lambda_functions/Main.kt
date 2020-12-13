class Main {

}

fun main(args: Array<String>) {
    val list = listOf("Kotlin", "is", "fun")
    val count = list.count { currentString ->
        currentString.length == 3
    }
    println(count)
}

fun List<String>.customCount(function: (String) -> Boolean): Int {
    var counter = 0
    for(string in this) {
        if(function(string)) {
            counter++
        }
    }
    return counter
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


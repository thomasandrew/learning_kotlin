class Main {

}

fun main(args: Array<String>) {
    val shoppingList = mutableListOf("Lamborguini", "Penthouse", "Rolex")
    shoppingList.add("Ferrari") // To add something to the list.

    for(shoppingItem in shoppingList) {
        println(shoppingItem)
    }

    for(i in 1..100) {
        println(i)
    }
}

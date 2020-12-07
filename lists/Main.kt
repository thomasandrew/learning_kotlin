class Main {

}

fun main(args: Array<String>) {
    val shoppingList = listOf<String>("Lamborghini", "Penthouse", "Rolex")
    println(shoppingList[0])

    val shoppingListTwo = mutableListOf("Lamborguini", "Penthouse", "Rolex")
    shoppingListTwo.add("Ferrari") // To add something to the list.
    println(shoppingListTwo[3])
}

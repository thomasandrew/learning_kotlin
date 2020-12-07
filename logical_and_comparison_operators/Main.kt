class Main {

}

fun main(args: Array<String>) {
    val amIAnAdult = true
    val amIAProgrammer = true
    //val amIAndultProgrammer = amIAnAdult && amIAProgrammer // || or
    val amIAndultProgrammer = (amIAnAdult == amIAProgrammer)
    val amIAndultProgrammer_two = !(amIAnAdult != amIAndultProgrammer) // i don't need to use (!)
    println(amIAndultProgrammer)
    println(amIAndultProgrammer_two)
}

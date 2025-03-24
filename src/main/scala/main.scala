import scala.language.postfixOps
import Task_main_files.*
@main
def main(): Unit = {
    //task1
    val test1: WordSearcher = new WordSearcher("contains");
    println(test1.search("слов", "строка со словом"))

    val test2 = new WordSearcher("exact");
    println(test2.search("слово", "строка со словом"))
    println(test2.search("слово", "строка где есть слово"))

    //task2
    val test3 = new CustomStack()
    test3.print_stack()
    for i: Int <- 1 to 5 do
        test3.add(i)
    test3.print_stack()
    for i: Int <- 1 to 3 do
        test3.remove()
    test3.print_stack()

    //task3

    val test4 = new CustomSet(List("asd", 3, 6, 5.0, 6, "skibidi"))
    println("Элемент test4")
    test4.elements_print()

    val test5 = new CustomSet(List("1string", 1, 2, "skibidi", 4.9))
    println("Элемент test5")
    test5.elements_print()

    println("Элементы test4 ∪ test5")
    test4.union(test5).elements_print()

    println("Элементы test4 - test5")
    test4.diff(test5).elements_print()

    println("Элементы test4 * test5")
    test4.multiple(test5).elements_print()
}






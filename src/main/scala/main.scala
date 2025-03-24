import Task_traits.{WordSearch, ExactMatchSearch, ContainsMatchSearch};
@main
def main(): Unit = {
    val test1: WordSearcher = new WordSearcher("contains");
    println(test1.search("слов", "строка со словом"))

    val test2 = new WordSearcher("exact");
    println(test2.search("слово", "строка со словом"))
    println(test2.search("слово", "строка где есть слово"))
}

class WordSearcher(searchType: String) extends WordSearch {
    override def search(word: String, text: String): Boolean = {
        searchType match {
            case "exact" => new ExactMatchSearch {}.search(word, text)
            case "contains" => new ContainsMatchSearch {}.search(word, text)
            case _ => throw new IllegalArgumentException("Invalid search type")
        }
    }
}


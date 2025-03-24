package Task_traits

trait WordSearch {
    def search(word: String, text: String): Boolean
}

trait ExactMatchSearch extends WordSearch {
    override def search(word: String, text: String): Boolean = {
        val words = text.replaceAll("[^а-яА-Я]+", " ").split(" ").toList;
        var marker = false
        for i:String <- words do
            if i == word then
                marker = true
        marker
    }
}

trait ContainsMatchSearch extends WordSearch {
    override def search(word: String, text: String): Boolean = {
        val words = text.replaceAll("[^а-яА-Я]+", " ").split(" ").toList;
        var marker = false
        for i: String <- words do
            if i.contains(word) then
                marker = true
        marker
    }
}
package Task_main_files

import Task_traits.*

class WordSearcher(searchType: String) extends WordSearch {
    override def search(word: String, text: String): Boolean = {
        searchType match {
            case "exact" => new ExactMatchSearch {}.search(word, text)
            case "contains" => new ContainsMatchSearch {}.search(word, text)
            case _ => throw new IllegalArgumentException("Invalid search type")
        }
    }
}

class CustomStack extends Stack_add with Stack_print with Stack_remove {
    private var _list = List[Any]()

    override def list: List[Any] = _list

    override def add(el: Any): Unit = {
        _list = el +: _list
    }

    override def print_stack(): Unit = {
        var answer = ""
        for i:Any <- _list do
            answer += i.toString + ", "
        println(answer.dropRight(2))
    }

    override def remove(): Unit = {
        _list = _list.tail
    }
}

class CustomSet(elements: List[Any]) extends Custom_set_union with Custom_set_multiple with Custom_set_difference {
    private val _list = elements.distinct

    override def union(second_set: CustomSet): CustomSet = {
        new CustomSet((_list ++ second_set._list).distinct)
    }

    override def multiple(second_set: CustomSet): CustomSet = {
        var new_list: List[(Any, Any)] = List()
        for i <- _list
            j <- second_set._list
        do
            new_list = new_list :+ (i,j)
        new CustomSet(new_list.distinct)
    }

    override def diff(second_set: CustomSet): CustomSet = {
        var new_list: List[Any] = List()
        for {i <- _list
        if !second_set._list.contains(i) }
        {
            new_list = new_list :+ i
        }
        new CustomSet(new_list.distinct)
    }

    def elements_print():Unit = {
        var answer = ""
        for i:Any <- _list do
            answer += i.toString + ", "
        println(answer.dropRight(2))
    }
}


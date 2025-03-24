package Task_traits

trait Stack_add {
    def list: List[Any]
    def add(el: Any): Unit
}

trait Stack_remove {
    def list: List[Any]
    def remove(): Unit
}

trait Stack_print {
    def list: List[Any]
    def print_stack(): Unit
}
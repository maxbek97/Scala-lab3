package Task_traits

import Task_main_files.CustomSet

trait Custom_set_union {
    def union(second_set: CustomSet): CustomSet
}

trait Custom_set_multiple {
    def multiple(second_set: CustomSet): CustomSet
}

trait Custom_set_difference {
    def diff(second_set: CustomSet): CustomSet
}
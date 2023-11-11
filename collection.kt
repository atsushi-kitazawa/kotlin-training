fun main() {
    list_test()

    val ret = list_sort(listOf(Employee(20, "hoge"), Employee(10, "uga")))
    println(ret)
}

fun list_test() {
    val readOnlyList = listOf("aaa", "bbb", "ccc")
    for (i in readOnlyList) {
        println(i)
    }

    var mutableList = mutableListOf("aaa", 1, true)
    mutableList.add("bbb")
    for (i in mutableList) {
        println(i)
    }

    val readOnlyList2: List<Int> = listOf(10, 20, 30)
    println(readOnlyList2.sum())
    println(readOnlyList2.map { it * 10 }) // transform operation map() function
    println(readOnlyList2.filter { it % 3 == 0 })
    // println(readOnlyList2.filter { it -> it % 3 == 0 }) // (T) can be omitted
}

data class Employee(val id: Int, val name: String)

fun list_sort(param: List<Employee>): List<Employee> {
    // val comparator = Comparator { e1: Employee, e2: Employee -> e1.id - e2.id }
    // return param.sortedWith(comparator)
    
    return param.sortedBy { it.id }
}

fun main(){
    if_test(4)
    if_test(7)

    val p: List<String> = listOf("aaa", "bbb", "ccc")
    for_test(3, p)

    when_test(1)
    when_test(3)
}

fun if_test(param: Int) {
    if (param % 2 == 0) {
        println("param is even.")
    } else {
        println("param is odd.")
    }
}

fun for_test(param1: Int, param2: List<String>) {
    for (i in 1..param1) {
        println("count is $i")
    }

    for(item in param2) {
        println("item is $item")
    }
}

fun when_test(param: Int) {
    when(param) {
        1 -> println("param is 1")
        2 -> println("param is 2")
        else -> println("other")
    }
}
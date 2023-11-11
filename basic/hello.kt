fun main() {
    var ret = hello("hoge")
    println(ret)
    ret = hello("uga")
    println(ret)
}

fun hello(name: String): String {
    return "hello " + name
}
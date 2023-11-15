// String syntax
fun msgPrint(msg: String): Unit {
    println("hello ${msg}")
}

// Functions
fun add(x: Int, y: Int): Int {
    return x + y
}

fun mul(x: Int, y: Int) = x * y

// Infix Functions
infix fun Int.times(s: String) = s.repeat(this)

infix fun String.concat(s: String): String {
    return this + " " + s
}

// vararg Parameters
fun log(vararg msg: String) {
    for (m in msg) println(m)
}

// Null Safety
fun null_test() {
    // var s: String = "hello"
    // s = null // compile error

    // var ss: String? = "hello"
    // ss = null
}

// Inheritance
open class A(val p1: String, val p2: String) {
    open fun call() {
        println("A")
    }

    fun call1() {
        println("AA")
    }
}

// p2 is passing parameter
class a(p2: String) : A("a", p2 = p2) {
    override fun call() {
        println("a")
    }
}

// for loops
fun testFor() {
    val list = listOf("a", "b", "c")
    for (i in list) {
        print(i)
    }
    println()
}

fun testRanges() {
    for (i in 0..10) {
        print(i)
    }
    println()
}

// Equality Check
fun equalityCheck() {
    // '==' is structual comparison
    // '===' is referential comparison
    val set1 = setOf("a", "b", "c")
    val set2 = setOf("b", "c", "a")
    println(set1 == set2)
    println(set1 === set2)

    val dict1 = mapOf(1 to "a", 2 to "b", 3 to "c")
    val dict2 = mapOf(2 to "b", 1 to "a", 3 to "c")
    println(dict1 == dict2)
    println(dict1 === dict2)
}

fun main() {
    // String syntax
    // msgPrint("bob")

    // Functions
    // println(add(10, 20))
    // println(mul(10, 20))

    // infix Functions
    // println(2 times "OK ")
    // println("hello" concat "world")

    // vararg Parameters
    // log("hello", "world", "bob")

    // Inheritance
    // val instanceA = a("a")
    // instanceA.call()
    // instanceA.call1()

    // for loops
    // testFor()
    // testRanges()

    // Equality Check
    equalityCheck()
}

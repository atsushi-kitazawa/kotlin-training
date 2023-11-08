class Person(val name: String, val age: Int){
    fun printName() {
        println(name)
    }
}

data class Point(val x: Int, val y: Int)

fun main() {
    val bob = Person("bob", 25)
    println(bob.name)
    println(bob.age)
    bob.printName()

    val p1 = Point(1, 2)
    println(p1)
    val p2 = Point(2, 2)
    if (p1 == p2) {
        println("equal instance")
    } else {
        println("not equal instance")
    }
}
fun main() {
    val a: Int = 10000
    println("a apakah identik dengan a atau a=== a : " + (a=== a))
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    println("boxedA apakah identi dengan anotherBoxeda atau atau boxedA === anotherBoxedA : " + (boxedA === anotherBoxedA))
    println("boxedA apakah memiliki nilai yang sama dengan anotherBoxedA atau boxedA == anotherBoxedA : " + (boxedA == anotherBoxedA))
}
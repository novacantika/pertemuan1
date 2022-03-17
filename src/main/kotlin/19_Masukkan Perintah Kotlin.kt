//Perintah masukkan di Kotlin yaitu sebuah fungsi readLine()!!
//Kotlin akan mengembalikan nilai String ke dalam variabel penampung.

//fun main() {
//    //Parrot program
//    println("Hi I'm Lora, the virtual parrot, and i love to repeat!");
//    println("Type something in: ");
//    var input: String
//    input = readLine()!!
//    var output: String
//    output = input + ", " + input + "!"
//    println(output)
//}

//Untuk merubah nilai String yang dikembalikan oleh fungsi readLine()!! kedalam nilai yang
//diinginkan bisa dilakukan dengan menggunakan konversi secara eksplisit

fun main() {
    //Doubler program parsing
    println("Enter a number and I'll double it: ")
    val input = readLine()!!
    var a = input.toInt() // eventually Double
    a = a * 2
    println(a)

    println("Enter a number, and I'll square it:")
    val number = readLine()!!.toInt()
    val square = number * number
    println("Result: " + square)
}
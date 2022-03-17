// Penggunaan tipe data String
//fun main() {
////    val myName: String = "Depandi Enda"
////    for(chr in myName){
////        print(chr)
////    }
////    print('\n')

//menggabungkan String dengan tipe data lain dengan menggunakan operator +,
// sehingga tipe data yang digabung otomatis akan melebur kedalam String.
//            fun main(args: Array<String>) {
//                val s = "abc" + 1
//                println(s + "def")
//            }

// Untuk dapat menyimpan data String yang memuat keywords Kotlin bisa dengan menggunakan
//raw String yang dipisahkan dengan triple quotes (""").
//        fun  main(args: Array<String>) {
//            var text = """
//            for (c in "foo")
//                print(c)
//        """
//            println(text)
//        }

//Kita juga dapat menghapus spasi yang tidak diperlukan dalam raw String
fun main(args: Array<String>) {
    var text = """
            |Tell me and I forget.
            |Teach me and I remember.
            |Involve me and I learn.
            |(Benjamin Franklin)
            """.trimMargin()
    println(text)
}
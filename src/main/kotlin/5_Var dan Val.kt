// perbedaan penggunaan Var dan Val

fun main() {
    // penggunaan kata kunci Var
    var varVariabel: Int
    varVariabel = 56 //nilai pertama untuk varVariable
    println("Pemberian nilai pertama pada varVariabel = " +varVariabel)
    varVariabel = 78 //nilai kedua untuk varVariable
    println("Pemberian nilai kedua pada varVariabel = " +varVariabel)

    // penggunaan kata kunci val
    val phi = 3.14
    //phi = 2.5

    //Ketika kita merubah nilai variabel val phi untuk kedua kalinya maka akan terdapat pesan +
// +kesalahan agar kita menggunakan var variabel.
}
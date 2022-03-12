fun main(args: Array<String>) {
    //String dapat diakses dengan operasi indeks array contoh s[i] atau dengan menggunakan for-loop
    val myName: String = "Nova Cantika Fitri"
    for(chr in myName){
        print(chr) }
    print('\n')
    //menggabungkan String dengan tipe data lain dengan menggunakan operator +,
    val s = "abc" + 1
    println(s + "def")
}
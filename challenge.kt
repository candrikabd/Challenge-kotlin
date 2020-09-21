import java.util.*
public var input = Scanner(System.`in`);

fun main() {
    println("===============================")
    print("Nama :")
    val nama: String? = input.nextLine()

    if (nama.isNullOrEmpty()) {
        println("Mohon diisi")
        main()
    }
    print("Kelas :")
    val kelas: String = input.nextLine()
    print("No Absen:")
    val Absen = input.nextInt()
    println("================================")
    println("Kamu Ingin Menghitung Apa?")
    menu()
}
fun menu(){
    println("1. Balok\n2. Bola\n ")
    print ("Pilih Bangun Ruang : ")
    val pill:Int? = input.nextInt()
    when (pill) {
        1 -> balok()
        2 -> bola()
        else -> {
            println("Pilihan tidak ada")
            menu()
        }
    }
    println("================================")
}
fun balok() {
    println("================================");
    print("Masukan Tinggi balok : ");
    val tinggi: Double = input.nextDouble();
    print("Masukan Panjang balok : ");
    val panjang: Double = input.nextDouble();
    print("Masukan lebar :");
    val lebar: Double = input.nextDouble() ;


    val v: Double = panjang * lebar * tinggi;
    print("Volume balok adalah ");
    System.out.printf("%.2f", v);
    println()
}
fun bola() {
    println("================================");
    print("Masukan jari-jari Bola : ");
    var jari: Double? = null
    jari = input.nextDouble();
    val v = 4/3 * Math.PI;
    print("Volume Tabungnya adalah ")
    System.out.printf("%.2f", v);
    println()
}
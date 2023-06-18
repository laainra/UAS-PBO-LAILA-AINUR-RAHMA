<h1 align="center">UAS PBO</h1>
<h2 align="center">Laila Ainur Rahma-V3922026-TI D</h2>
<p align="center">Saya membuat project perhitungan zakat yang mengimplementsaikan konsep Object Oriented Programming</p>

- 'Class dan Object'
      Konsep class dan object diterapkan di dalam file yang sama, yaitu dalam class-class seperti ZakatFitrah, ZakatMaal, ZakatEmas dan class Main.

-'Encapsulation'
    Konsep encapsulation diterapkan pada class-class ZakatFitrah, ZakatMaal, ZakatEmas, Infak, dan Sedekah. Properti-properti pada class tersebut dienkapsulasi dengan menggunakan modifier akses private, serta getter dan setter digunakan untuk mengakses dan mengubah nilai-nilai properti tersebut.

-'Abstract Class'
    Konsep abstract class diterapkan dalam class Zakat yang berfungsi sebagai superclass. Class Zakat adalah sebuah abstract class yang memiliki metode abstrak "hitungZakat()". Class-class turunannya, yaitu ZakatFitrah, ZakatMaal, dan ZakatEmas, mengimplementasikan metode ini.

-'Inheritance'
    Konsep inheritance diterapkan dalam class-class ZakatFitrah, ZakatMaal, dan ZakatEmas. Ketiga class tersebut merupakan subclass dari class Zakat, sehingga mereka mewarisi properti dan metode dari class tersebut.

-'Polymorphism'
     Konsep polymorphism diterapkan melalui inisialisasi objek dengan menggunakan tipe referensi superclass Zakat. Sebagai contoh, objek zakatFitrah, zakatMaal, dan zakatEmas diinisialisasi dengan tipe Zakat.

-'Interface'
     Konsep interface diterapkan dalam interface LayananZakat. Interface ini menyediakan deklarasi metode "hitungZakat()" yang diimplementasikan oleh class-class ZakatFitrah, ZakatMaal, dan ZakatEmas.

-'Validation'
    Validasi input pengguna terdapat pada metode-metode "hitungZakatFitrah()", "hitungZakatMaal()", "hitungZakatEmas()", "hitungInfak()", dan "hitungSedekah()". Validasi dilakukan menggunakan penanganan eksepsi (exception handling) untuk memastikan input yang dimasukkan adalah angka yang valid.

-'Annotation'
    @Override digunakan untuk mendeklarasikan evorride method pada class ZakatFitrah, ZakatMaal, dan ZakatEmas

-'Exception Handling'
    Konsep exception handling digunakan dalam kode tersebut untuk menangani situasi-situasi yang tidak terduga atau error. Blok "try-catch" digunakan untuk menangkap NumberFormatException yang terjadi jika pengguna memasukkan input yang tidak valid, seperti menginputkan teks bukan angka. Dogunakan pada class Main.

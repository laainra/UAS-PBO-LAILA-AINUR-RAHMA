package LayananZakat; // file berada pada Package LayananZakat

// Deklarasi class ZakatFitrah yang extends abstrac class Zakat dan implements interface LayananZakat
public class ZakatFitrah extends Zakat implements LayananZakat {
    private double jumlahOrang; // deklarasi atribut private jumlahOrang 

    public ZakatFitrah() { //deklarasi Konstruktor ZakatFitrah
        this.jumlahOrang = 0; // menginisialisasi atribut jumlahOrang dengan nilai 0
    }

    public double getJumlahOrang() { //deklarasi method  getter getJumlahOrang()
        return jumlahOrang; // mengembalikan nilai atribut jumlahOrang
    }

    public void setJumlahOrang(double jumlahOrang) { // deklarasi method setter setJumlahOrang()
        this.jumlahOrang = jumlahOrang; // mengubah nilai atribut jumlahOrang.
    }

    @Override
    public void hitungZakat() { // implementasi method hitungZakat() yang diwarisi dari interface LayananZakat
        this.jumlahZakat = this.jumlahOrang * 2.5; // menghitung jumlah zakat dengan mengalikan jumlahOrang dengan 2.5 dan menyimpan hasilnya ke dalam atribut jumlahZakat yang diwarisi dari class Zakat
    }
}
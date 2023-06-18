package LayananZakat; // file berada pada Package LayananZakat


// Deklarasi class ZakatMaal yang extends abstract class Zakat dan implements interface LayananZakat
public class ZakatMaal extends Zakat implements LayananZakat {
    private double jumlahHarta; // deklarasi atribut private jumlahharta

    public ZakatMaal() {  //Deklarasi Konstruktor ZakatMaal
        this.jumlahHarta = 0; // menginisialisasi atribut jumlahHarta dengan nilai 0.
    }

    public double getJumlahHarta() { // Deklarasi Method  getter getJumlahHarta
        return jumlahHarta; // mengembalikan nilai dari atribut jumlahHarta
    }

    public void setJumlahHarta(double jumlahHarta) { // Deklarasi Method  setter setJumlahHarta
        this.jumlahHarta = jumlahHarta; // mengubah nilai atribut jumlahHarta.
    }
    // Implementasi method hitungZakat dari interface LayananZakat
    @Override
    public void hitungZakat() {
        this.jumlahZakat = this.jumlahHarta * 0.025; // menghitung jumlah zakat
    }
}

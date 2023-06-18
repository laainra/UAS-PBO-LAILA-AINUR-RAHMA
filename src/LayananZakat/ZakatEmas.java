package LayananZakat; // // file berada pada Package LayananZakat

// // Deklarasi class ZakatEmas yang extends Zakat dan implements LayananZakat
public class ZakatEmas extends Zakat implements LayananZakat {
    private double beratEmas; // // deklarasi atribut private beratEmas

    public ZakatEmas() { //Deklarasi Konstruktor ZakatEmas
        this.beratEmas = 0; // menginisialisasi atribut beratEmas dengan nilai 0.
    }

    public double getBeratEmas() { //Deklarasi Method getBeratEmas
        return beratEmas; // mengembalikan nilai dari atribut beratEmas,
    }

    public void setBeratEmas(double beratEmas) { //Deklarasi Method setBeratEmas
        this.beratEmas = beratEmas; // mengubah nilai atribut beratEmas.
    }

    // Implementasi method hitungZakat dari interface LayananZakat
    @Override
    public void hitungZakat() {
        this.jumlahZakat = this.beratEmas * 0.025; // menghitung jumlah zakat dengan mengalikan beratEmas dengan 0.025
    }
}

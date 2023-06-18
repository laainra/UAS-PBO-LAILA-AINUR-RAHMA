package LayananZakat; // file berada pada Package LayananZakat

abstract class Zakat {  // Deklarasi class abstract Zakat
    protected double jumlahZakat; // Atribut protected jumlahZakat

    public Zakat() {  // Konstruktor Zakat
        this.jumlahZakat = 0; // Menginisialisasi jumlahZakat dengan 0
    }

    public double getJumlahZakat() { // Deklaraasi Method getJumlahZakat
        return jumlahZakat; // Mengembalikan nilai jumlahZakat
    }

    abstract void hitungZakat(); // Deklarasi method abstract hitungZakat
}

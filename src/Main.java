// Import class ZakatFitrah, ZakatMaal, dan ZakatEmas dari package LayananZakat
import LayananZakat.ZakatFitrah;
import LayananZakat.ZakatMaal;
import LayananZakat.ZakatEmas;
import java.util.Scanner; // import scanner untuk mengambil input

// Deklarasi class Main
public class Main {

    // Deklarasi Method utama main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // deklarasi object scanner

        System.out.println("Selamat datang di Layanan Zakat");
        System.out.println("------------------------------");

        int pilihan = 0; // inisialisasi variabel pilihan = 0

        // Looping do-while untuk menampilkan menu dan menerima input pilihan pengguna
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Zakat Fitrah");
            System.out.println("2. Zakat Maal");
            System.out.println("3. Zakat Emas");
            System.out.println("0. Keluar");

            System.out.print("\nPilihan Anda: ");

            try {
                pilihan = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Masukkan pilihan dengan angka.");
                continue;
            }

            // Switch statement untuk menjalankan fungsi terkait dengan pilihan pengguna
            switch (pilihan) {
                case 1:
                    hitungZakatFitrah(scanner);
                    break;
                case 2:
                    hitungZakatMaal(scanner);
                    break;
                case 3:
                    hitungZakatEmas(scanner);
                    break;
                case 0:
                    System.out.println("\nTerima kasih telah menggunakan Layanan Zakat.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang tersedia.");
                    break;
            }
        } while (pilihan != 0);

        scanner.close();
    }

        // Method untuk menghitung zakat fitrah
    private static void hitungZakatFitrah(Scanner scanner) {
        System.out.println("\n--- Zakat Fitrah ---");

        // Membuat objek zakatFitrah dari class ZakatFitrah
        ZakatFitrah zakatFitrah = new ZakatFitrah();

        System.out.print("Masukkan jumlah orang yang dikenai zakat: ");

        // membuat blok try-catch untuk menangani kemungkinan kesalahan saat parsing input dengan NumberFormatException
        try {
            double jumlahOrang = Double.parseDouble(scanner.nextLine());
            zakatFitrah.setJumlahOrang(jumlahOrang);
        } catch (NumberFormatException e) {
            System.out.println("Masukkan jumlah orang dengan angka.");
            return;
        }

            // Menghitung zakat dengan memanggil method hitungZakat()
        zakatFitrah.hitungZakat();
        double jumlahZakat = zakatFitrah.getJumlahZakat();

        System.out.println("\nJumlah zakat yang harus dibayarkan: " + jumlahZakat + " kg beras");
    }

    // Method untuk menghitung zakat maal
    private static void hitungZakatMaal(Scanner scanner) {
        System.out.println("\n--- Zakat Maal ---");

        // Membuat objek zakatMaal dari class ZakatMaal
        ZakatMaal zakatMaal = new ZakatMaal();

        System.out.print("Masukkan jumlah harta yang dikenai zakat: ");

        // membuat blok try-catch untuk menangani kemungkinan kesalahan saat parsing input dengan NumberFormatException
        try {
            double jumlahHarta = Double.parseDouble(scanner.nextLine());
            zakatMaal.setJumlahHarta(jumlahHarta);
        } catch (NumberFormatException e) {
            System.out.println("Masukkan jumlah harta dengan angka.");
            return;
        }

        // Menghitung zakat dengan memanggil method hitungZakat()
        zakatMaal.hitungZakat();
        double jumlahZakat = zakatMaal.getJumlahZakat();

        System.out.println("\nJumlah zakat yang harus dibayarkan: Rp " + jumlahZakat);
    }

        // Method untuk menghitung zakat emas
    private static void hitungZakatEmas(Scanner scanner) {
        System.out.println("\n--- Zakat Emas ---");

        // Membuat objek zakatEmas dari class ZakatEmas
        ZakatEmas zakatEmas = new ZakatEmas();

        System.out.print("Masukkan berat emas yang dikenai zakat (gram): ");

        // membuat blok try-catch untuk menangani kemungkinan kesalahan saat parsing input dengan NumberFormatException
        try {
            double beratEmas = Double.parseDouble(scanner.nextLine());
            zakatEmas.setBeratEmas(beratEmas);
        } catch (NumberFormatException e) {
            System.out.println("Masukkan berat emas dengan angka.");
            return;
        }

        // Menghitung zakat dengan memanggil method hitungZakat()
        zakatEmas.hitungZakat();
        double jumlahZakat = zakatEmas.getJumlahZakat();

        System.out.println("\nJumlah zakat yang harus dibayarkan: Rp " + jumlahZakat);
    }


    
}


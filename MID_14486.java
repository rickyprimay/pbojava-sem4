import java.util.Scanner;

class MenuMakanan {
    String nama;
    double harga;

    public MenuMakanan(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }
}

class MenuMinuman {
    String nama;
    double harga;

    public MenuMinuman(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }
}

class Pembelian {
    String namaPembeli;
    MenuMakanan makanan;
    MenuMinuman minuman;
    int jumlahMakanan;
    int jumlahMinuman;

    public Pembelian(String namaPembeli, MenuMakanan makanan, MenuMinuman minuman, int jumlahMakanan, int jumlahMinuman) {
        this.namaPembeli = namaPembeli;
        this.makanan = makanan;
        this.minuman = minuman;
        this.jumlahMakanan = jumlahMakanan;
        this.jumlahMinuman = jumlahMinuman;
    }

    public double totalBayar() {
        return (makanan.harga * jumlahMakanan) + (minuman.harga * jumlahMinuman);
    }
}

public class MID_14486 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String grid = "===============================================";
        String nameShop = "Rumah Makan A11-14486";
        boolean condition = true;
        String city = "Purwodadi";
        String address = "Jalan Soponyono 1";
        String menuMakanan1 = "Nasi Rames";
        String menuMakanan2 = "Nasi Rendang";
        String menuMakanan3 = "Nasi Ruwet";
        String menuMakanan4 = "Nasi Pindang";
        String menuMinuman1 = "Es Teh";
        String menuMinuman2 = "Es Jeruk";
        String menuMinuman3 = "Es Sirup";

        MenuMakanan nasiRames = new MenuMakanan("Nasi Rames", 15000);
        MenuMakanan nasiRendang = new MenuMakanan("Nasi Rendang", 20000);
        MenuMakanan nasiRuwet = new MenuMakanan("Nasi Ruwet", 18000);
        MenuMakanan nasiPindang = new MenuMakanan("Nasi Pindang", 17000);

        MenuMinuman esTeh = new MenuMinuman("Es Teh", 5000);
        MenuMinuman esJeruk = new MenuMinuman("Es Jeruk", 6000);
        MenuMinuman esSirup = new MenuMinuman("Es Sirup", 7000);

        while (condition) {
            System.out.println("Selamat datang di " + nameShop);
            
            System.out.print("Masukkan nama pembeli: ");
            String namaPembeli = scanner.nextLine();
            
            double totalBayar = 0;
            int jumlahMakanan = 0;
            int jumlahMinuman = 0;
            
            while (true) {
                System.out.println("Menu Makanan:");
                System.out.println("1. " + nasiRames.nama + " - Rp " + nasiRames.harga);
                System.out.println("2. " + nasiRendang.nama + " - Rp " + nasiRendang.harga);
                System.out.println("3. " + nasiRuwet.nama + " - Rp " + nasiRuwet.harga);
                System.out.println("4. " + nasiPindang.nama + " - Rp " + nasiPindang.harga);
                
                System.out.print("Pilih menu makanan atau masukkan 0 jika ingin lanjut memesan minuman: ");
                int pilihanMakanan = scanner.nextInt();
                
                if (pilihanMakanan == 0) break;
                
                System.out.print("Masukkan jumlah ");
                MenuMakanan makanan;
                switch (pilihanMakanan) {
                    case 1:
                        System.out.print(nasiRames.nama);
                        makanan = nasiRames;
                        break;
                    case 2:
                        System.out.print(nasiRendang.nama);
                        makanan = nasiRendang;
                        break;
                    case 3:
                        System.out.print(nasiRuwet.nama);
                        makanan = nasiRuwet;
                        break;
                    case 4:
                        System.out.print(nasiPindang.nama);
                        makanan = nasiPindang;
                        break;
                    default:
                        System.out.println("Pilihan tidak valid!");
                        continue;
                }
                System.out.print(" yang ingin dipesan: ");
                int jumlah = scanner.nextInt();
                jumlahMakanan += jumlah;
                totalBayar += makanan.harga * jumlah;
            }
            
            while (true) {
                System.out.println("Menu Minuman:");
                System.out.println("1. " + esTeh.nama + " - Rp " + esTeh.harga);
                System.out.println("2. " + esJeruk.nama + " - Rp " + esJeruk.harga);
                System.out.println("3. " + esSirup.nama + " - Rp " + esSirup.harga);
                System.out.println("4. Bayar");
                
                System.out.print("Pilih menu minuman atau tekan 4 jika ingin lanjut ke pembayaran: ");
                int pilihanMinuman = scanner.nextInt();
                
                if (pilihanMinuman == 4) break;
                
                System.out.print("Masukkan jumlah ");
                MenuMinuman minuman;
                switch (pilihanMinuman) {
                    case 1:
                        System.out.print(esTeh.nama);
                        minuman = esTeh;
                        break;
                    case 2:
                        System.out.print(esJeruk.nama);
                        minuman = esJeruk;
                        break;
                    case 3:
                        System.out.print(esSirup.nama);
                        minuman = esSirup;
                        break;
                    default:
                        System.out.println("Pilihan tidak valid!");
                        continue;
                }
                System.out.print(" yang ingin dipesan: ");
                int jumlah = scanner.nextInt();
                jumlahMinuman += jumlah;
                totalBayar += minuman.harga * jumlah;
            }
            
            System.out.println("\n" + grid);
            System.out.println("|               Struk Pembelian:              |");
            System.out.println("|   Nama Rumah Makan: " + nameShop + "   |");
            System.out.println("|   Kota: " + city + "                           |");
            System.out.println("|   Alamat: " + address + "                 |");
            System.out.println("|   Nama Pembeli: " + namaPembeli + "                       |");
            System.out.println("|   Jumlah Makanan: " + jumlahMakanan + "                         |");
            System.out.println("|   Jumlah Minuman: " + jumlahMinuman + "                         |");
            System.out.println("|   Total Bayar: Rp " + totalBayar + "                   |");
            System.out.println(grid);
            
            System.out.print("Masukkan jumlah uang yang dibayarkan: ");
            double uangBayar = scanner.nextDouble();
            if (uangBayar < totalBayar) {
                System.out.println("Uang yang Anda bayarkan kurang, proses pembelian dibatalkan.");
                System.out.println("Uang Anda yang kurang: Rp " + (totalBayar - uangBayar));
                return;
            } else {
                double kembalian = uangBayar - totalBayar;
                System.out.println("Uang kembalian Anda: Rp " + kembalian);
            }
            
            System.out.print("Ingin melanjutkan pesanan? (Ya/Tidak): ");
            String lanjut = scanner.next();
            if (lanjut.equalsIgnoreCase("Tidak")) {
                condition = false;
            }
            scanner.nextLine(); 
        }
    }
}

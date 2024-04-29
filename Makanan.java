import java.util.Scanner;

public class LatihanAplikasi {
    public static void main(String[] args) {

        exit: while (true) {
            int harga = 15000;
            String menu1 = null;
            String menu2 = null;
            String menu3 = null;
            String menu4 = null;

            System.out.println("Menu Restoran: ");
            System.out.println("1. Nasi Goreng\t 2. Nasi Rawon\t 3. Nasi Gudeg\t 4. Jus Jeruk");
            System.out.println("5. Hasil Jumlah\t 6. Keluar Aplikasi");
            while (true) {
                System.out.print("Pilih Menu: ");
                Scanner input = new Scanner(System.in);
                int pilih = input.nextInt();

                if (pilih == 1) {
                    harga += 15000;
                    menu1 = "Nasi Goreng";
                } else if (pilih == 2) {
                    harga += 15000;
                    menu2 = "Nasi Rawon";
                } else if (pilih == 3) {
                    harga += 15000;
                    menu3 = "Nasi Gudeg";
                } else if (pilih == 4) {
                    harga += 15000;
                    menu4 = "Jus Jeruk";
                } else if (pilih == 5) {
                    System.out.print("Pilihan Menu Adalah: ");
                    if (menu1 != null) {
                        System.out.print(menu1+ ", ");
                    }
                    if (menu2 != null) {
                        System.out.print(menu2+ ", ");
                    }
                    if (menu3 != null) {
                        System.out.print(menu3+ ", ");
                    }
                    if (menu4 != null) {
                        System.out.println(menu4+ ", ");
                    }
                    System.out.println("Total Yang Harus Dibayar Rp. " +harga);
                    System.out.println("\nUang yang dibayarkan: ");
                    int bayar = input.nextInt();
                    if (bayar < harga) {
                        System.out.println("Maaf Uang Anda Tidak Cukup");
                        break;
                    }
                    int kembalian = bayar - harga;
                    System.out.println("Uang Kembalian Anda Rp." +kembalian);
                    break;
                } else if (pilih == 6) {
                    System.out.println("Anda Telah Keluar Dari Aplikasi!");
                    break exit;
                }
            }
        }
    }
}
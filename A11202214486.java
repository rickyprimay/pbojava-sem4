import java.util.Scanner;

public class A11202214486 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String grid = "==========================";

        boolean kondisi = true;
        int saldo = 100000;
        int simpanUang = 150000;
        int ambilUang = 150000; 

        while (kondisi) {

            System.out.println("Apakah anda ingin menggunakan ATM? (Y/N)");
            String yes = scanner.next();
            if (yes.equalsIgnoreCase("y")) {
                int pilihan;

                System.out.println(grid + " ATM " + grid);
                System.out.println("1. Cek Saldo");
                System.out.println("2. Simpan Uang");
                System.out.println("3. Ambil Uang");
                System.out.println("4. Keluar");
                System.out.println("Pilih");
                System.out.println(grid + grid + "=====");

                pilihan = scanner.nextInt();

                switch (pilihan) {
                    case 1:
                        System.out.println("Saldo anda adalah Rp. " + saldo);
                        break;
                    case 2:
                        saldo += simpanUang;
                        System.out.println("Jumlah uang yang anda simpan Rp. " + simpanUang);
                        System.out.println("Saldo anda sekarang adalah Rp." + saldo);
                        break;
                    case 3:
                        if (ambilUang <= saldo) {
                            saldo -= ambilUang;
                            System.out.println("Jumlah uang yang anda ambil adalah Rp. " + ambilUang);
                            System.out.println("Saldo anda sekarang adalah Rp." + saldo);
                        } else {
                            System.out.println("Saldo tidak mencukupi");
                        }
                        break;
                    case 4:
                        kondisi = false;
                        break;
                    default:
                        System.out.println("Pilihan tidak valid");
                }

            } else if (yes.equalsIgnoreCase("n")) {
                kondisi = false;
            } else {
                System.out.println("pilih y atau n saja");
            }
        }
        scanner.close();
    }
}

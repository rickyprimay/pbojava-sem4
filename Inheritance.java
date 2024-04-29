import java.util.Scanner;

class BangunDatar {
    public float luas(){
        return 0;
    }

    public float keliling(){
        return 0;
    }
}

class Persegi extends BangunDatar {
    float sisi;

    public void setSisi(float sisi){
        this.sisi = sisi;
    }

    @Override
    public float luas(){
        return sisi*sisi;
    }

    @Override
    public float keliling(){
        return 4*sisi;
    }
}

class Lingkaran extends BangunDatar {
    float r;

    public void setR(float r){
        this.r = r;
    }

    @Override
    public float luas(){
        return (float)3.14 * r * r;
    }

    @Override
    public float keliling(){
        return 2 * (float) 3.14 * r;
    }
}

class PersegiPanjang extends BangunDatar {
    float panjang;
    float lebar;

    public void setPanjang(float panjang){
        this.panjang = panjang;
    }

    public void setLebar(float lebar){
        this.lebar = lebar;
    }

    @Override
    public float luas(){
        return panjang * lebar;
    }

    @Override
    public float keliling(){
        return 2 * (panjang + lebar);
    }
}

class Segitiga extends BangunDatar {
    float alas;
    float tinggi;

    public void setAlas(float alas){
        this.alas = alas;
    }

    public void settinggi(float tinggi){
        this.tinggi = tinggi;
    }

    public float luas(){
        return (float) 0.5 * alas * tinggi;
    }

    public float keliling(){
        return alas + alas + alas;
    }
}

class Inheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Persegi persegi = new Persegi();
        Lingkaran lingkaran = new Lingkaran();
        PersegiPanjang persegipanjang = new PersegiPanjang();
        Segitiga segitiga = new Segitiga();
        var grid = "---------------------------------------------------------------";

        System.out.println("Program Inheritance");
        System.out.println(grid);
        // Persegi
        System.out.println("Masukkan panjang sisi persegi:");
        persegi.sisi = scanner.nextFloat();
        System.out.println("Luas persegi dengan sisi " + persegi.sisi + " adalah: " + persegi.luas());
        System.out.println("Keliling persegi dengan sisi " + persegi.sisi + " adalah: " + persegi.keliling());

        System.out.println(grid);
        // Lingkaran
        System.out.println("Masukkan jari-jari lingkaran:");
        lingkaran.r = scanner.nextFloat();
        System.out.println("Luas lingkaran dengan jari-jari " + lingkaran.r + " adalah: " + lingkaran.luas());
        System.out.println("Keliling lingkaran dengan jari-jari " + lingkaran.r + " adalah: " + lingkaran.keliling());

        System.out.println(grid);
        // Persegi Panjang
        System.out.println("Masukkan panjang persegi panjang:");
        persegipanjang.panjang = scanner.nextFloat();
        System.out.println("Masukkan lebar persegi panjang:");
        persegipanjang.lebar = scanner.nextFloat();
        System.out.println("Luas persegi panjang dengan panjang " + persegipanjang.panjang + " dan lebar " + persegipanjang.lebar + " adalah: " + persegipanjang.luas());
        System.out.println("Keliling persegi panjang dengan panjang " + persegipanjang.panjang + " dan lebar " + persegipanjang.lebar + " adalah: " + persegipanjang.keliling());

        System.out.println(grid);
        // Segitiga
        System.out.println("Masukkan alas segitiga:");
        segitiga.alas = scanner.nextFloat();
        System.out.println("Masukkan tinggi segitiga:");
        segitiga.tinggi = scanner.nextFloat();
        System.out.println("Luas segitiga dengan alas " + segitiga.alas + " dan tinggi " + segitiga.tinggi + " adalah: " + segitiga.luas());
        System.out.println("Keliling segitiga dengan alas " + segitiga.alas + " adalah: " + segitiga.keliling());

        scanner.close();
    }
}

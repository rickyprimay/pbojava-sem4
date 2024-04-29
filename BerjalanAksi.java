class BerjalanAksi {
    public static void main(String[] args) {
        var o = new Orang();
        o.langkah_kanan();
        o.langkah_kiri();
        o.langkah_kiri();
        o.langkah_kanan();
        o.langkah_kanan();
    }
}

interface BerjalanInterface {
    public void langkah_kiri();
    public void langkah_kanan();
}

class Orang implements BerjalanInterface {
    int status;

    int STATUS_KAKI_KIRI = 0;
    int STATUS_KAKI_KANAN = 1;

    public void langkah_kiri() {
        if (status == STATUS_KAKI_KIRI) {
            System.out.println("Kaki kiri sudah melangkah");
        } else {
            status = STATUS_KAKI_KIRI;
            System.out.println("Melangkah kaki kiri");
        }
    }

    public void langkah_kanan() {
        if (status == STATUS_KAKI_KANAN) {
            System.out.println("Kaki kanan sudah melangkah");
        } else {
            status = STATUS_KAKI_KANAN;
            System.out.println("Melangkah kaki kanan");
        }
    }
}
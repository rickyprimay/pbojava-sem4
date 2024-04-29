
class AirConditioner {
    public static void main(String[] args) {
        var ac = new AC();
        ac.nyalakan();
        ac.nyalakan();
        ac.matikan();
        ac.matikan();
    }
}

interface ACInterface {
    public void nyalakan();
    public void matikan();
}

class AC implements ACInterface {
    int status;

    int STATUS_AC_MATI = 0;
    int STATUS_AC_NYALA = 1;

    public void nyalakan() {
        if (status == STATUS_AC_NYALA) {
            System.out.println("AC Sudah Nyala");
        } else {
            status = STATUS_AC_NYALA;
            System.out.println("AC Dinyalakan");
        }
    }

    public void matikan() {
        if (status == STATUS_AC_MATI) {
            System.out.println("AC Sudah mati");
        } else {
            status = STATUS_AC_MATI;
            System.out.println("AC Dimatikan");
        }
    }
}
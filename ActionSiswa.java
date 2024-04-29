class ActionSiswa {
    public static void main(String [] args) {
        Siswa std=new Siswa();
        std.setNis("12345678");
        std.setName("Ricky Primayuda Putra");
        std.setYearborn(2004);

        System.out.println("the student name is " + std.getName() + " and student nis is " + std.getNis() + " and he born at " + std.getYearborn());
    }
}

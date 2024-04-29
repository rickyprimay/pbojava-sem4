class Siswa {
    private String nis;
    private String name;
    private int yearBorn;

    public void setNis(String nis){
        this.nis=nis;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setYearborn(int yearBorn){
        this.yearBorn=yearBorn;
    }
    String getName(){
        return name;
    }
    String getNis(){
        return nis;
    }
    int getYearborn(){
        return yearBorn;
    }
}
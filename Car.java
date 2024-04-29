class Car {
    private String type;
    private String name;
    private int year;
    
    public Car(){}
    public Car(String type, String name, int year){
        this.type=type;
        this.name=name;
        this.year=year;
    }

    public void setType(String type){
        this.type=type;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setYear(int year){
        this.year=year;
    }
    String getName(){
        return name;
    }
    String getType(){
        return type;
    }
    int getYear(){
        return year;
    }

    public void showRoom(){
        System.out.println("car name : " + this.name);
        System.out.println("car type : " + this.type);
        System.out.println("car year : " + this.year);
    }
}
class Smartphone {
    private String name;
    private int price;
    private int createdat;
    
    public Smartphone(){}
    public Smartphone(String name, int price, int createdat){
        this.name=name;
        this.price=price;
        this.createdat=createdat;
    }

    public void SmartphoneStore(){
        var grid = "----------------------------------";
        System.out.println("smartphone name : " + this.name);
        System.out.println("smartphone price : " + this.price);
        System.out.println("smartphone prudction at : " + this.createdat);
        System.out.println(grid);
    }
}
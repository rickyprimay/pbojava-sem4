class Hallo {
    public static void main(String[] args) {
        var firstName = "Ricky Primayuda";
        var lastName = "Putra";
        var nim = "A11.2022.14486";
        var fullName = firstName + lastName;
        var address = "Purwodadi";
        var age = 19;
        var grid = "==================================================";
        float a = 10;
        float b = 3;
        var result = a + b;
        float divide = a / b;
        var grade = 92;

        System.out.println(grid);
        System.out.println(fullName);
        System.out.println(grid);
        System.out.println("Hello, " + firstName + "! " + "With NIM : " + nim);
        System.out.println(grid);
        System.out.println("He live in " + address);
        System.out.println(grid);
        System.out.println("and he is " + age + " Years old");
        System.out.println(grid);
        System.out.println("result from " + a + " + " + b + " is " + result);
        System.out.println(grid);
        System.out.println(divide);
        System.out.println(grid);

        if (grade >= 85){
            System.out.println("A");
        } else if (grade >= 75 && grade <= 84){
            System.out.println("B");
        } else if (grade >= 65 && grade <= 74) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
}
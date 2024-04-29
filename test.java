
import java.util.Scanner;

class Test{
    public static void main(String[] as){
        var grid = "==========================";
        int grade;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Learn Java");
            System.out.println(grid);

            System.out.println("Input your name");
            System.out.println(grid);
            String name=input.nextLine();

            System.out.println("Hello :"+name);
            System.out.println(grid);
            System.out.println("Input your grade : ");
            System.out.println(grid);

            grade=input.nextInt();
            System.out.println("your grade is " + grade);
            System.out.println(grid);
            
            if(grade >= 85){
                System.out.println("Your Grade is A");
                System.out.println(grid);
            }
            else if(grade >= 80 && grade <= 84){
                System.out.println("Your Grade is B");
                System.out.println(grid);
            }
            else if(grade >= 70 && grade <= 79){
                System.out.println("Your Grade is C");
                System.out.println(grid);
            }
            else if(grade >= 60 && grade <= 69){
                System.out.println("Your Grade is D");
                System.out.println(grid);
            }
            else {
                System.out.println("Your Grade is E");
                System.out.println(grid);
            }

            System.out.println("Input First number : ");
            int firstNumber=input.nextInt();
            System.out.println("Input Second number : ");
            int secondNumber=input.nextInt();

            int result = firstNumber+secondNumber;
            System.out.println("the result from " + firstNumber + " + " + secondNumber + " = " + result);

            boolean conditional = true;
            int j = 0;
            while (conditional){
                j++;
                System.out.println(j + " Ricky");
                if (j==10){
                    break;
                }
            
            
            Scanner firstMenu = new Scanner(System.in);
                String yes="Y";
                if(yes=="y" || yes=="Y"){
                    int choose = 0;
                    System.out.println("=== Menu ===");
                    System.out.println("1. Sum      ");
                    System.out.println("2. Minus    ");
                    System.out.println("3. Multiply ");
                    System.out.println("4. Divide   ");
                    System.out.println("5. Exit     ");
                    System.out.println("============");
                    System.out.println("Choose");

                    choose=firstMenu.nextInt();
                    
                    if(choose == 1){
                        System.out.println("u choose "+choose);
                    }else if (choose == 2){
                        System.out.println("u choose "+choose);
                    }else if (choose == 3){
                        System.out.println("u choose "+choose);
                    }else if (choose == 4){
                        System.out.println("u choose "+choose);
                    }else {
                        break;
                    }

                    
                }
            }
            
        }

    }
}
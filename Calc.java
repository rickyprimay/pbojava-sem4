import java.util.Scanner;

public class Calc {
    public static void main(String[] as) {
        var grid = "==========================";
        int grade;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Learn Java");
            System.out.println(grid);

            System.out.println("Input your name");
            System.out.println(grid);
            String name = input.nextLine();

            System.out.println("Hello: " + name);
            System.out.println(grid);
            System.out.println("Input your grade: ");
            System.out.println(grid);

            grade = input.nextInt();
            System.out.println("Your grade is " + grade);
            System.out.println(grid);

            if (grade >= 85) {
                System.out.println("Your Grade is A");
                System.out.println(grid);
            } else if (grade >= 80 && grade <= 84) {
                System.out.println("Your Grade is B");
                System.out.println(grid);
            } else if (grade >= 70 && grade <= 79) {
                System.out.println("Your Grade is C");
                System.out.println(grid);
            } else if (grade >= 60 && grade <= 69) {
                System.out.println("Your Grade is D");
                System.out.println(grid);
            } else {
                System.out.println("Your Grade is E");
                System.out.println(grid);
            }

            Scanner firstMenu = new Scanner(System.in);
            boolean conditional = true;
            int j = 0;
            while (conditional) {
                j++;
                System.out.println(j);
                if (j == 10) {
                    break;
                }

                System.out.println("Do you want to calculate? (Y/N)");
                String yes = firstMenu.next();
                if (yes.equalsIgnoreCase("y")) {
                    int choose = 0;
                    System.out.println(grid + " Menu " + grid);
                    System.out.println("1. Sum");
                    System.out.println("2. Minus");
                    System.out.println("3. Multiply");
                    System.out.println("4. Divide");
                    System.out.println("5. Exit");
                    System.out.println(grid + grid);
                    System.out.println("Choose");

                    choose = firstMenu.nextInt();

                    System.out.println("Input First number: ");
                    int firstNumber = input.nextInt();
                    System.out.println("Input Second number: ");
                    int secondNumber = input.nextInt();

                    switch (choose) {
                        case 1:
                            System.out.println("The result from " + firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
                            break;
                        case 2:
                            System.out.println("The result from " + firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
                            break;
                        case 3:
                            System.out.println("The result from " + firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
                            break;
                        case 4:
                            if (secondNumber == 0) {
                                System.out.println("Cannot divide by zero!");
                            } else {
                                System.out.println("The result from " + firstNumber + " / " + secondNumber + " = " + ((double) firstNumber / secondNumber));
                            }
                            break;
                        case 5:
                            break;
                        default:
                            System.out.println("Invalid choice.");
                    }

                } else if (yes.equalsIgnoreCase("n")) {
                    conditional = false;
                } else {
                    System.out.println("Invalid input. Please enter Y or N.");
                }
            }
        }
    }
}

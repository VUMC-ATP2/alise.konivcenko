package homeworkTwo;

import java.util.Scanner;

public class HomeWorkTwo {
    public static void main(String[] args) {
        // 1 task
        System.out.print("\n1 task\n");
        int x = 8;
        System.out.println(x > 0); //a. task
        System.out.println( x < 0); //b. task
        boolean result = 1 > 2;
        result = x > 5 && x <= 10;
        System.out.println(result); //c. task
        result = x >= 5 && x < 10;
        System.out.println(result); //d. task
        result = x == 0 || x == 10;
        System.out.println(result); //e. task
        result = (x * x) > 10;
        System.out.println(result); //f.task

        // 2 task
        System.out.print("\n2 task\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write number of month: ");
        int month = scanner.nextInt();
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("Septenber");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Incorrect number of month! Please enter number from 1 to 12.");

        }
        // 3 task
        System.out.print("\n3 task\n");
        Scanner scanner2 = new Scanner(System.in);
        int a, b, c;
        System.out.println("Please enter 3 integral numbers: ");
        a = scanner2.nextInt();
        b = scanner2.nextInt();
        c = scanner2.nextInt();
        if (a > b && a > c) {
            System.out.println("The largest number is: " + a);
        } else if ( b > a && b > c) {
            System.out.println("The largest number is: " + b);
        } else if (c > a && c > b) {
            System.out.println("The largest number is: " + c);
        } else {
            System.out.println("Incorrect data entered, please enter integral numbers!");
        }
        // 4 task
        System.out.print("\n4 task\n");
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Please enter red, yellow or green: ");
        String colour = scanner3.next();

        switch (colour) {
            case "red":
                System.out.println("You should stop and wait for green light!");
                break;
            case "yellow":
                System.out.println("You should be ready to go after green light will appear!");
                break;
            case "green":
                System.out.println("You can cross the street now, be quick!");
                break;
            default:
                System.out.println("Please fix this traffic light!");
        }
        // 5 task in main method
        System.out.print("\n5 task\n");

        printBusinessCard("Alise", "Konivcenko", "+37128342012", 1994);

        String name = "Alise";
        String surname = "Konivcenko";
        String phoneNumber = "+37128342012";
        int yearOfBirth = 1994;

        printBusinessCard(name, surname, phoneNumber, yearOfBirth);
        printBusinessCard(name, surname, phoneNumber, yearOfBirth);

        // 6 task in main method
        System.out.print("\n6 task\n");
        printBusinessCardTwo("Nikita", "Milka", "+37126816664", 1994);
        printBusinessCardTwo("Alex", "Laima", "+37133333333", 1932);

        // 7 task in main method
        System.out.print("\n7 task\n");
        int sum = sumOfTwoNumbers(8, 10);
        System.out.println(sum);

        // 8 task in main method
        System.out.print("\n8 task\n");
        System.out.println(average(3, 4, 6));
    }
    /*
    public static(=lai var izsaukt) void(=neko neatgriez) printMyNameAndAge(=metodes nosaukums)(String name, int age) {
    *method body*
    System.out.printf("Your name is %s. And your age is %d\n", name, age);
    }

    lai izsaukt metodi main classa > jaievada metodes nosaukums, piem.:
    printMyNameAndAge("Alise", 27);
    !!! Ja ir lietots void - nevares pie main classes ielikt so metodi pie mainigiem(string,int utt), jo neko neatgriez

    public static int(=lai atgriez so datu tipu) sumOfTwoNumbers(int x, int y) {
    int summa = x + y;
    return summa; (pedeja rinda vienmer bus return)
    vai
    return x + y;
    }

    lai izsaukt main classa >
    System.out.println(sumOfTwoNumbers(10,30); (=kur x = 10, y = 30)
         */

    // 5 task
    public static void printBusinessCard(String name, String surname, String phoneNumber, int yearOfBirth) {
        System.out.printf("Business Card\n##########\nName: %s\nSurname: %s\nPhone number: %s\nYear of birth: %d\n##########\n", name, surname, phoneNumber, yearOfBirth);
    }
    // 6 task
    public static void printBusinessCardTwo(String name, String surname, String phoneNumber, int yearOfBirth) {
        System.out.printf("Business Card\n##########\nName: %s\nSurname: %s\nPhone number: %s\nYear of birth: %d\n##########\n", name, surname, phoneNumber, yearOfBirth);
    }
    // 7 task
    public static int sumOfTwoNumbers(int a, int b) {
        return a + b;
    }
    // 8 task
    public static double average(double a, double b, double c) {
        return (a + b + c) / 3;
    }
}

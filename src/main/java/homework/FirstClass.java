package homework;

import java.sql.SQLOutput;

public class FirstClass {
    public static void main(String[] args) {
// first task
        System.out.print("\nFirst task\n\n");
        String country = "USA";
        int USApopulation = 329824950;
        int USAarea = 9833520;
        String capitalOfUSA = "Washington";
        String USAlanguage = "English";
        boolean USAisEUmember = false;
        boolean USAnotEUmember = true;
        String USAcurrency = "$";
        System.out.printf("Current population of the %s is %d.\n", country, USApopulation);
        System.out.printf("Total area of the %s is %d km2.\n", country, USAarea);
        System.out.printf("%s is the capital of %s.\n", capitalOfUSA, country);
        System.out.printf("%s most commonly used language in %s.\n", USAlanguage, country);
        if(USAisEUmember) {
            System.out.println("USA is EU member.");
        } else {
            System.out.println("USA is not EU member.");
        }
        System.out.printf("%s is the currency of the USA.\n", USAcurrency);

// second task
        System.out.print("\nSecond task\n\n");
        String myName = "Alise";
        String myHobbie = "motorcycle";
        String myHobbie2 = "hiking";
        String myProfession = "accountant";
        float myPoffesionalExperience = 6.5f;
        int myAge = 27;
        String myCar = "BMW";
        System.out.printf("Hello, my name is %s. I am %d years old and I have been working as an %s for %.1f years. My hobbies are %s and %s. Also I am in love my %s car.\n", myName, myAge, myProfession, myPoffesionalExperience, myHobbie, myHobbie2, myCar);

// third task
        System.out.print("\nThird task\n\n");
        String operator = "arithmetic operator";
        System.out.printf("%s +\n", operator);
       int a = 8;
       int b = 9;
       int c = a + b;
        System.out.println(c);
        int x = b + 10;
        System.out.println(x);
        int y = a + x;
        System.out.println(y);

        System.out.printf("%s -\n", operator);
        double a2 = 8.5645677d;
        double b2 = 9.57667875d;
        double c2 = b2 - a2;
        System.out.println(c2);
        double x2 = b2 - 5.1265896d;
        System.out.println(x2);
        double y2 = a2 - x2;
        System.out.println(y2);

        System.out.printf("%s *\n", operator);
        float a3 = 3.4f;
        float b3 = 2.3f;
        float c3 = a3 * b3;
        System.out.println(c3);
        float x3 = a3 * 2;
        System.out.println(x3);
        float y3 = b3 * x3;
        System.out.println(y3);

        System.out.printf("%s /\n", operator);
        byte a4 = 8;
        short b4 = 4;
        long c4 = 454167;
        long x4 = c4 / b4;
        System.out.println(x4);
        int y4 = a4 / b4;
        System.out.println(y4);
        long d5 = c4 / 3;
        System.out.println(d5);
    }

}

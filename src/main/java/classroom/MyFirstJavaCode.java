package classroom;

public class MyFirstJavaCode {
    public static void main(String[] args) {
        /* (ctrl + /) vai (ctrl + shift + /)

         */
        byte floorCount = 7;
        System.out.println("My house has " + floorCount + " floors");
        /*
        %d = numbers
        %s = text/string
        %b = boolean
        %f - floating
        %1.f = 1 number after comma
        \n = new line after this
         */
        System.out.printf("My house has %d floors\n", floorCount);
        short salaryInEur = 1000;
        System.out.println(salaryInEur);
        System.out.println(1200);

        System.out.printf("Average salary for Junior QA Engineer is: %d\n", salaryInEur);

        int chinaPopulation = 1449687399;
        long currentWorldPopulation = 794689780;
        System.out.printf("Current world population: %d people. In meanwhile China population: %d people\n", currentWorldPopulation, chinaPopulation);

//        Floating numbers
        float myCurrentWeight = 57.5f;
        System.out.println(myCurrentWeight);

        double gasPriceInEur = 1.83455d;
        System.out.println(gasPriceInEur);

//        primitive text
        char firstLettersOfMyName = 'A';
//        non-primitive text
        String myName = "Alise";
        System.out.println(myName);

        String mySentence = "Hello, my name is Alice.";
        String mySecondSentence = "I live in Riga.";
        System.out.println(mySentence);
        System.out.println(mySentence + mySecondSentence);
        System.out.println(mySentence + " " + mySecondSentence);
        System.out.printf("%s %s\n", mySentence, mySecondSentence);

//        boolean
//        is / has
//        isSummer , hasItems

        boolean isSummer = false;
        boolean isSpring = true;
        System.out.println(isSpring);
        System.out.println(isSummer);

        if(isSummer) {
            System.out.println("Yes, it is summer");
        } else {
            System.out.println("No, it is not summer");
        }

//        arithmetic operators + - / *

        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c);
        int x = b + 15;
        System.out.println(x);

        System.out.println(7 + 7);
        System.out.println("7" + 7);
        System.out.println("7" + "7");

        boolean isAgreaterThanB = a > b;
        boolean isAsmallerThanB = a < b;


    }
}

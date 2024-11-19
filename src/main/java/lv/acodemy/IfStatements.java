package lv.acodemy;

public class IfStatements {
    public static void main(String[] args) {

//        int number = 8;
//        if (number % 2 == 0) {
//            System.out.println("The number is even");
//        } else {
//            System.out.println("The number id Odd");
//        }
//        //Check if number positive or negative
//
//        number = -5;
//        if (number >= 0) {
//            System.out.println("The number is positive");
//        } else {
//            System.out.println("The number is negative");
//        }
        //Grade checker (if-else-if)
        //90> A
        //75-> 89 = B
        //50->74
        //< 50 = F

        int score = 80;
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 75) {
            System.out.println("Grade: B");
        } else if (score >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }

        //task #1 - Check if a person is eligible to buy an alcohol

        int age = 15;
        if (age >= 18) {
            System.out.println("You can buy an alcohol");
        } else {
            System.out.println("You can't buy an alcohol");
        }
        //task #2 Check if a number can be divided by 5

        int number = 11;
        if (number % 5 == 0) {
            System.out.println("The number can be divided by 5");
        } else {
            System.out.println("The number can't be divided by 5");
        }
        //Task #3 Check pass of fail if score >=50 (passed) all others (failed)

        int score2 = 30;
        if (score2 >= 50) {
            System.out.println("passed");
        } else {
            System.out.println("failed");
        }

        //Task 4 - Temperature message
        //above 30 (it's hot)
        //Temp beetween 15 and 30 (Nice weather)
        //Below 15 (It's cold)

        int temperature = 35;

        if (temperature > 30) {
            System.out.println("It's hot");
        } else if (temperature >= 15 && temperature <= 30) {
            System.out.println("Nice weather");
        } else {
            System.out.println("It's cold");
        }
        //traffic light system
        //Green ->go
        //Yellow -> Slow down
        //Red -> Stop
        //String color;
        //if (color.equals("Green")) {}

        String trafficLight = "Green";
        if ("Green".equals(trafficLight)) {
            System.out.println("Go");
        } else if ("Yellow".equals(trafficLight)) {
            System.out.println("Slow down");
        } else if ("Red".equals(trafficLight)) {
            System.out.println("Stop");
        } else {
            System.out.println("Invalid color");
        }

    }
}

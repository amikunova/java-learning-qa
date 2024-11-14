package lv.acodemy;

public class Variables {
    public static void main(String[] args) {

        // This is my comment
        /*
        bla bla bla
         */
        // int (integer) - whole number / natural number
        int age = 31;
        int currentYear = 2024;

        // currentYear = camel case (lower camel case) - good practice
        // current_year = snake case - never do like this!!!
        // current-year = kebab case - never do like this!!!

        int inventoryItemCount = 100;

        System.out.println(age);
        System.out.println(currentYear);
        System.out.println(inventoryItemCount);

        double temperature = 36.6;
        double price = 19.99;
        double distance = 38400.0;

        System.out.println(temperature);
        System.out.println(price);

        char grade = 'A';
        char myInitial = 'N';
        char currencySymbol = '$';

        System.out.println(grade);
        System.out.println(myInitial);
        System.out.println(currencySymbol);

        //boolean (can keep only 2 values - true or false)

        boolean hasAccess = true;
        System.out.println(hasAccess);

        boolean isSummer = false;
        System.out.println(isSummer);

        //long
        long phoneNumber = 1234567890;
        System.out.println(phoneNumber);

        //float
        float interestRate = 0.05f;
        System.out.println(interestRate);

        //Arithmetic operators

        String name = "Nastya";
        String lastName = "Mikunova";
        System.out.println(name);
        System.out.println(lastName);
        String fullName = name + " " + lastName;
        System.out.println(fullName);


        //string - %s
        //numbers - %d
        System.out.println(String.format("My name is: %s, My surname is: %s" , name, lastName));

        var myCurrentAge = 31;
        var text = "Hello World";

        String myVar;
        myVar = "Hello World";

    }
}

package lv.acodemy;

public class Practice {
    public static void main(String[] args) {

        //write a for loop prints number from 1 to 10 on a separates lines

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        // Using a for loop, print all even numbers from 2 to 10
        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

            for (int j = 2; j <= 20; j += 2) {
                System.out.println(j);
            }
        }
        //use a for loop to print the multiplication table of 5 up to 5*10
        for (int l = 1; l<=10; l++){
            System.out.println(5*l);
        }

        }
    }

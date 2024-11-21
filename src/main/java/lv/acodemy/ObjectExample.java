package lv.acodemy;

import lv.acodemy.objects.Car;
import lv.acodemy.objects.Dog;

public class ObjectExample {
    public static void main(String[] args) {
        //Encapsulation (Getters, Setters)
        //Inheritance ()
        //Polymorphism
        //Abstraction
        Car audi = new Car("blue", "RS6"); //audi - тут объект
        audi.start();
        System.out.println(audi);

        // audi.color =  "Blue";
        // audi.model = "RS6";

        audi.setColor("Blue");
        audi.setModel("RS6");
        System.out.println(audi);

        Car bmw = new Car("Red", "X5");
        bmw.setColor("Red");
        bmw.setModel("X5");
        bmw.start();
        System.out.println(bmw);

        // Print text My car model is %s and color is %s

        System.out.println(String.format("My car model is %s and color is %s", bmw.getModel(), bmw.getColor())); //%s - параметр строка, //%d - digital
        System.out.println("My car model is " + bmw.getModel() + " and color is " + bmw.getColor());

        Dog sharik = new Dog();
        sharik.bark();
        sharik.eat();

    }

}

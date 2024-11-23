package lv.acodemy.homework;

public class Dispenser {
    private final String name; // если мы создаем переменную в классе, то можем ее устанавливать, если ниже мы создаем конструктор, а котором обязательно в эту переменную будет устанавливаться значение
    private final String color;
    private final String model;
    private final int size;
    private int amount;

    public Dispenser(String name, String color, String model, int size) {
        this.name = name; //this - Обращаемся к чему-то в этом классе
        this.color = color;
        this.model = model;
        this.size = size;
        this.amount = size;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getSize() {
        return size;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "%s[%s:%s] %d/%d".formatted(name, model, color, amount, size);
    }

    public void take(int count) {
        amount = amount - count;
    }
}

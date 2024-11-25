package lv.acodemy.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DispenserTest {
    @Test
    public void testToString() {
        Dispenser helloKitty = new Dispenser("Zefirka","mix","hello-kitty",20);

        String expected = "Zefirka[hello-kitty:mix] 20/20";

        assertEquals(expected, helloKitty.toString());
    }

    @Test
    public void testName() {
        Dispenser helloKitty = new Dispenser("Zefirka","mix","hello-kitty",20);
        assertEquals("Zefirka", helloKitty.getName());
    }

    @Test
    public void testTake() {
        Dispenser helloKitty = new Dispenser("Zefirka","mix","hello-kitty",20);
        boolean success = helloKitty.take(1);

        assertEquals(19, helloKitty.getAmount()); // проверяем, что мы смогли успешно забрать 1 конфету
        assertEquals(true, success);
    }

    @Test
    public void testTakeOverThenMax() {
        Dispenser helloKitty = new Dispenser("Zefirka","mix","hello-kitty",20);
        boolean success = helloKitty.take(21);

        assertEquals(false, success); // ты не можешь взять конфеты, так как пытаешься взять больше чем есть
        assertEquals(20, helloKitty.getAmount()); //проверяем, что количество конфет не уменьшилось
    }

    @Test
    public void testTakeLessThenZero() {
        Dispenser helloKitty = new Dispenser("Zefirka","mix","hello-kitty",20);
        boolean success = helloKitty.take(0);

        assertEquals(false, success); //проверяем, что количество конфет не уменьшилось

        success = helloKitty.take(-5);

        assertEquals(false, success); //
        assertEquals(20, helloKitty.getAmount()); //проверяем, что количество конфет не уменьшилось
    }

}
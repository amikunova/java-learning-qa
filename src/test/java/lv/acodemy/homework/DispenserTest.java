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
        helloKitty.take(1);

        assertEquals(19, helloKitty.getAmount());
    }
}
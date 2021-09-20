package ex28;

import org.junit.jupiter.api.Test;
import ex28.App;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    public void test() {
        assertEquals(15, App.addFiveNumbers(1, 2, 3, 4, 5));
    }
}
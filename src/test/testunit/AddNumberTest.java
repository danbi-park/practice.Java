package testunit;

//junit을 내가 쓰겠다.
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddNumberTest {
    AddNumber addNumber = new AddNumber();

    @Test
    public void multiply() {
        assertEquals(addNumber.add(8, 9), 17);
    }

    @Test
    public void testMultiply() {
        assertEquals(addNumber.add(2, 3, 4), 9);
    }
}
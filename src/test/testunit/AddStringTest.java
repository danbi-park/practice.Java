package testunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddStringTest {
    AddString addString = new AddString();

    @Test
    void add() {
        assertEquals(addString.add("집에 ","갈래요"),"집에 갈래요");
    }
}
package at.fhtw.TestProject.Service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestServiceTest {
private final TestService service = new TestService();

    @Test
    void getSquare() {
        assertEquals(100, service.getSquare(10));
        //statt eine range -> mehrere Testfälle schreiben
    }

}
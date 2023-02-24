import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CoalingMainTest {

    @Test
    public void TestGetNextValue() {
        int testValue = 123;
        int expectedValue = testValue * 2;
        int returnedValue = CoalingaMain.getNextValue(testValue);
        Assertions.assertEquals(expectedValue, returnedValue);

        testValue = 0;
        expectedValue = 1;
        returnedValue = CoalingaMain.getNextValue(testValue);
        Assertions.assertEquals(expectedValue, returnedValue);
    }
}

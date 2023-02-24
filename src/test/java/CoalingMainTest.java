import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CoalingMainTest {

    @Test
    public void TestGetNextValue() {
        int testValue = 123;
        int expectedValue = testValue + 1;
        int returnedValue = CoalingaMain.getNextValue(testValue);
        Assertions.assertEquals(expectedValue, returnedValue);
    }
}

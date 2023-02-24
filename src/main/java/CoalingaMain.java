public class CoalingaMain {

    public static int getNextValue(int prevValue) {
        return prevValue + 1;
    }

    public static void main(String[] args) {
        int prevValue = 0;
        for (int i = 0; i < 10; ++i) {
            int currValue = getNextValue(prevValue);
            System.out.println("Current number: " + currValue);
            prevValue = currValue;
        }
    }
}

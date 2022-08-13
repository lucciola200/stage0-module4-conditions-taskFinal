package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        int result = 0;
        switch (divider) {
            case 0:
                System.out.println("division by zero");
                break;
            default:
                result = (dividend / divider) * divider;
                System.out.println(result == dividend ? "can be divided completely" : "cannot be divided completely");
        }
    }
}

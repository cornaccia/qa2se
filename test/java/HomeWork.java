import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeWork {

    public float calc(float number, float persent) {
        return number*(persent/100);
    }

    public int car(int bak, int rasstoyanie) {
        return  bak/rasstoyanie*100;
    }

    @Test
    public void showSum() {
        float result = calc(100, 5);
        Assertions.assertEquals(5, result, "Shit!!!");
    }
    public void testCar() {
        float result = car(8, 80);
        Assertions.assertEquals(8, result, "Shit!!!");
    }


}
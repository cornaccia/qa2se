import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OurFirstTest {

    public Integer sum(Integer a, Integer b) {
       return a + b;
    }

    @Test
    public void showSum() {
        //c = sum(15, 5);
        Integer d = sum(15, 6);

        //  System.out.println("C is: " + c +"");
        // System.out.println("C is: " + c + " and D is:" + d);

        Assertions.assertEquals(20, d, "Shit!!!");
    }


}

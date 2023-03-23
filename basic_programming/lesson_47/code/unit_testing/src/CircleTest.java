import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {

    @Test
    public void givenRadius_whenCalculateArea_thenReturnArea(){
        double actualArea = Circle.calculateArea(1d);
        double expectedArea = Math.PI;
      //  double expectedArea = 3.14;


        assertEquals(expectedArea,actualArea);
      //  assertEquals(actualArea,expectedArea);

    }
    @Test
    public void givenAandB_whenCompare_thenReturnBoolean(){
        assertTrue(Circle.compareNumbers(5,3));

    }

    @Test
    public void givenThreeAndZero_whenCompare_thenReturnTrue(){
        assertTrue(3>0);
    }

    @Test
    public void givenThreeLessThanZero_whenResultFalse_thenReturnTrue(){

        assertFalse(3<0);

    }
}

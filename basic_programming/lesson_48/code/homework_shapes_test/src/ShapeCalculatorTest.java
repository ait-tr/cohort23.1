import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShapeCalculatorTest {
    ShapeCalculator shapeCalculator;
    Shape circle = new Circle("Circle",10); ;
    Shape rectangle =new Rectangle("Rectangle",5,10);
    Shape square = new Square("Square",7);
    Shape[] shapes = {circle,rectangle,square};
    List<Shape> shapeList = Arrays.asList(shapes);



    @BeforeEach
      public void init() {
          shapeCalculator = new ShapeCalculator();

      }


    @Test
    public void test_sorted() {
        Shape[] expected ={square,rectangle,circle};
        List<Shape>expectedList = Arrays.asList(expected);

        Arrays.sort(shapes);
        Collections.sort(shapeList);

        assertArrayEquals(expected,shapes);
        assertEquals(expectedList,shapeList);
    }
    @Test
    public void test_sorted_one(){
        Shape[] expected ={circle};
        Shape[] actual ={circle};
        Arrays.sort(actual);

        assertArrayEquals(expected,actual);
    }

    @Test
    public void test_two_shapes() {
        Shape[] shapes = {new Circle("Circle",10), new Rectangle("Rectangle",5,10)};
        assertEquals(364.0,shapeCalculator.totalSquare(shapes));
    }

    @Test
    public void test_one_shape(){
        Shape[] shapes = {new Rectangle("Rectangle",5,10)};

        assertEquals(50,shapeCalculator.totalSquare(shapes));
    }

    @Test
    public void test_zero_shape(){
        Shape[] shapes = {};
        assertEquals(0,shapeCalculator.totalSquare(shapes));
    }
}
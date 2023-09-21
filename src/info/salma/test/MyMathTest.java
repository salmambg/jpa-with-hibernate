package info.salma.test;

import info.salma.main.MyMath;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {
   private MyMath math = new MyMath();

    @Test
    void calculateSum_threeMemberArray() {
//        int[] numbers = {1,2,3};
//        int result = math.calculateSum(numbers);
//        int expectedResult = 6;
//        assertEquals(expectedResult, result);
        assertEquals(6, math.calculateSum(new int[]{1,2,3}));
    }
    @Test
    void calculateSum_ZeroLengthArray() {
        assertEquals(0, math.calculateSum(new int[]{}));
    }
}
import junit.framework.TestCase;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MoveZeroesTest extends TestCase {

    public void testExample1(){
        int[] nums = {0, 1, 0, 3, 12};
        Main.Solution.moveZeroes(nums);
        int[] expectedPrices = {1,3,12,0,0};
        assertEquals(Arrays.toString(expectedPrices), Arrays.toString(nums));
    }

    public void testExample2(){
        int[] nums = {0};
        Main.Solution.moveZeroes(nums);
        int[] expectedPrices = {0};
        assertEquals(Arrays.toString(expectedPrices), Arrays.toString(nums));
    }
}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {



    @Test
    void findToSumInArray() {
        Main main = new Main();
        final int[] array = {5, 1, 3, 2, 7};
        final var sum = 10;

        final int[] expected = {3, 7};

        final int[] actual = main.findToSum(array, sum);
        assertArrayEquals(expected, actual);
    }


    @Test
    void findToSumInArray0() {
        Main main = new Main();
        final int[] array = {};
        final var sum = 0;

        final int[] expected = {};

        final int[] actual = main.findToSum(array, sum);
        assertArrayEquals(expected, actual);
    }


    @Test
    void findToSumInArrayFalse() {
        Main main = new Main();
        final int[] array = {5, 1, 3, 2, 7};
        final var sum = 20;

        final int[] expected = {};

        final int[] actual = main.findToSum(array, sum);
        assertArrayEquals(expected, actual);
    }
}
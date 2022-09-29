package by.itstep.gulik.model;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayWorkerTest {

    @Test
    public void testMaxPositive() {
        int[] array = {};
        int expected = 7;

        int actual = ArrayWorker.max(array);

        assertEquals(expected, actual);
    }

    @Test (expected = RuntimeException.class)
    public void testMaxWithEmptyObject() {
        int[] array = {};
        ArrayWorker.max(array);

    }

    @Test (expected = RuntimeException.class)
    public void testMaxWithNull() {
        int[] array = {};
        ArrayWorker.max(array);

    }
}

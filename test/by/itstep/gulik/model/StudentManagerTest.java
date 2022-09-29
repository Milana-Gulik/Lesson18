package by.itstep.gulik.model;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentManagerTest {

    @Test
    public void testCalcAvgStudentMarkPositive() {
        int[] marks = {8, 8, 9, 8};
        double expected = 8.25;

        double actual = StudentManager.calcAvgStudentMark(marks);

        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testCalcAvgStudentMarkWithEmptyObject() {
        int[] marks = {};
        double expected = -1;

        double actual = StudentManager.calcAvgStudentMark(marks);

        assertEquals(expected, actual, 0);
    }

    @Test
    public void testCalcAvgStudentMarkWithNull() {
        int[] marks = null;
        double expected = -1;

        double actual = StudentManager.calcAvgStudentMark(null);

        assertEquals(expected, actual, 0);
    }
}

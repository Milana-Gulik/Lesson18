package by.itstep.gulik.model;

public class StudentManager {
    public static double calcAvgStudentMark(int[] marks) {

        double s = 0;

        for (int i = 0; i < marks.length; i++) {
            s += marks[i];
        }

        return s / marks.length;
    }
}

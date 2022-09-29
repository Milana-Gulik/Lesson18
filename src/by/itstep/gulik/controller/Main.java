package by.itstep.gulik.controller;

import by.itstep.gulik.model.StudentManager;
import by.itstep.gulik.view.Printer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input count of students: ");
        int count = scanner.nextInt();

        int[] marks = new int[count];

        System.out.print("Input student's marks: ");

        for (int i = 0; i < marks.length; i++) {
            marks[i] = scanner.nextInt();
        }

        double avg = StudentManager.calcAvgStudentMark(marks);

        String msg = String.format("Student's average mark is %.2f", avg);

        Printer.print (msg);
    }
}

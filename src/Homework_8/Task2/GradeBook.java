package Homework_8.Task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GradeBook {

    public static void main(String[] args) {
        Set<String> namesOfStudents = TestResult.listOfStudentsNames();
        HashMap<String, Integer> firstTest = TestResult.getOriginalGrades();
        HashMap<String, Integer> secondTest = TestResult.getMakeUpGrades();
        HashMap<String, Integer> gradeBookMap = new HashMap<>();


        for (String studentName : namesOfStudents) {
            int firstTestResult = firstTest.get(studentName);
            int secondTestResult = secondTest.get(studentName);
            if (firstTestResult > secondTestResult) {
                gradeBookMap.put(studentName, firstTestResult);
            } else {
                gradeBookMap.put(studentName, secondTestResult);
            }
        }
        gradeBookMap.forEach(((k, v) -> System.out.println(k + " " + v)));

    }
}
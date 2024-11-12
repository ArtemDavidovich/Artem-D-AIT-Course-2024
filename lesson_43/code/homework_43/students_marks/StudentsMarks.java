package homework_43.students_marks;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentsMarks {

    private static final int MIN = 1;
    private static final int MAX = 5;
    private static final int N_SUBJECTS = 10;

    public static void main(String[] args) {

        List<Students> students = generateStudents(20, 10);
        students.forEach(System.out::println);

        System.out.println("============minAverage==============");

        Optional<Students> minAverage = students.stream()
                .min(Comparator.comparingDouble(Students::getAverageGrade));

        System.out.println(minAverage);

        System.out.println("============maxAverage==============");

        Optional<Students> maxAverage = students.stream()
                .max(Comparator.comparingDouble(Students::getAverageGrade));

        System.out.println(maxAverage);


    }//end of main

    private static List<Students> generateStudents(int numStudents, int numSubjects) {
        Random random = new Random();
        List<Students> students = new ArrayList<>();

        for (int i = 1; i <= numStudents; i++) {
            List<Integer> marks = random
                    .ints(numSubjects, 1, 6)
                    .boxed()
                    .collect(Collectors.toList());

            students.add(new Students("Student " + i, marks));
        }
        return students;
    }


}//end of class

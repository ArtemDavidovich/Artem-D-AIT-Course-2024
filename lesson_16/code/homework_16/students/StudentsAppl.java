package homework_16.students;

//Task 2. Create a Student class with private fields:
//
//id
//Name
//surname
//year of birth
//specialization
//Standard methods:
//
//constructor for all fields;
//getters and setters for all fields;
//display method.
//Additional methods:
//
//study
//take a vacation
//pass the exam
//...
//In the StudentAppl class, create several students. Display the learning process.

import homework_16.students.model.Students;

public class StudentsAppl {

    public static void main(String[] args) {

        //setting student instances
        Students s1 = new Students(1, "Maggie", "Smith", 2003, "Economist");
        Students s2 = new Students(2, "Fred", "Mercury", 2005, "Physician");
        Students s3 = new Students(3, "Taylor", "Swift", 2004, "Lawyer");

        //printing the students
        System.out.println(s1.display());
        System.out.println(s2.display());
        System.out.println(s3.display());

        System.out.println();

        //setting array with students
        Students[] students = new Students[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        //printing students' routine
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getName() + " " + students[i].getSurname() + "'s learning process:");
            if(students[i].getSpecialization().equals("Economist")){
                students[i].study();
                students[i].vacation();
                students[i].party();
                students[i].exam();
            } else if(students[i].getSpecialization().equals("Physician")){
                students[i].study();
                students[i].exam();
            } else if(students[i].getSpecialization().equals("Lawyer")){
                students[i].vacation();
                students[i].party();
                students[i].exam();
            }
            System.out.println();
        }

    }//end of main

}//end of class

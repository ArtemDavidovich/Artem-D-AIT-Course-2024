package homework_16.students.model;

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

public class Students {

    //fields
    private int id;
    private String name;
    private String surname;
    private int year;
    private String specialization;

    //constructor
    public Students(int id, String name, String surname, int year, String specialization) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.specialization = specialization;
    }

    //setters
    public void setSurname(String surname) {
        this.surname = surname;
    }

    //getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYear() {
        return year;
    }

    public String getSpecialization() {
        return specialization;
    }

    //display
    public String display(){
        return String.format("ID: %d, name: %s, surname: %s, year of birth: %d, specialization: %s", id, name, surname, year, specialization);
    }

    //extra methods
    public void study(){
        System.out.println(name + " studies.");
    }

    public void vacation(){
        System.out.println(name + " goes on vacation.");
    }

    public void party(){
        System.out.println(name + " goes to a party.");
    }

    public void exam(){
        System.out.println(name + " passes the exam.");
    }

}//end of class

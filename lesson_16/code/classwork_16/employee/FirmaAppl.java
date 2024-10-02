package classwork_16.employee;

import classwork_16.employee.model.Employee;

public class FirmaAppl {

    public static void main(String[] args) {

        Employee e1 = new Employee(1,"N1","LN1",3000, true);
        Employee e2 = new Employee(2,"N2","LN2",4000, true);
        Employee e3 = new Employee(3,"N3","LN3",2500, false);
        Employee e4 = new Employee(4,"N4","LN4",3300, true);
        Employee e5 = new Employee(5,"N5","LN4",3300, false);

        double totalSalary = e1.getSalary() + e2.getSalary() + e3.getSalary() + e4.getSalary() + e5.getSalary();

        System.out.println(e1.display());
        System.out.println(e2.display());
        System.out.println(e3.display());
        System.out.println(e4.display());
        System.out.println(e5.display());

        System.out.println("Total salary = " + totalSalary);

        Employee[] employees = new Employee[5];
        employees[0] = e1;
        employees[1] = e2;
        employees[2] = e3;
        employees[3] = e4;
        employees[4] = e5;

        totalSalary = 0;

        for (int i = 0; i < employees.length; i++) {
            totalSalary += employees[i].getSalary();
        }

        System.out.println(totalSalary);

        e5.setSalary(6000);
        System.out.println(e5.display());


    }//end of main

}//end of class

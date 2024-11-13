package classwork_45.employee_save_read;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class SaveEmployeeAppl {

    public static void main(String[] args) {



    Address address1 = new Address("Isny", "Maierhoefener Strasse", 25, 6, 88316);
    Address address2 = new Address("Isny", "Maierhoefener Strasse", 25, 5, 88316);

    Employee e1 = new Employee(1, "Peter", LocalDate.of(1989, 8, 30), 5900, address1);
    Employee e2 = new Employee(2, "Jacob", LocalDate.of(1979, 7, 25), 5700, address2);

    Set<Employee> firma = new HashSet<>();

    firma.add(e1);
    firma.add(e2);

    //отправляем в файл
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.dat"))) {

            oos.writeObject(firma);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }//end of main

}//end of class

package classwork_27.ait.employee.test;

import classwork_27.ait.employee.dao.Company;
import classwork_27.ait.employee.dao.CompanyImpl;
import classwork_27.ait.employee.model.Employee;
import classwork_27.ait.employee.model.Manager;
import classwork_27.ait.employee.model.SalesManager;
import classwork_27.ait.employee.model.Worker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyImplTest {

    Company company;
    Employee[] emp;

    @BeforeEach
    void setUp() {
        //create object
        company = new CompanyImpl(5);
        //fill array to fill object company
        emp = new Employee[4];
        emp[0] = new Manager(1,"N1","S1",160,5000,25);
        emp[1] = new SalesManager(2,"N2","S2",160,50000,0.1);
        emp[2] = new SalesManager(3,"N3","S3",160,80000,0.15);
        emp[3] = new Worker(4,"N4","S4",160,20);

        for (int i = 0; i < 4; i++) {
            company.addEmployee(emp[i]);
        }

    }

    @Test
    void addEmployeeTest() {
        //can't add null
        assertFalse(company.addEmployee(null));
        //can't add duplicate
        assertFalse(company.addEmployee(emp[1]));
        //can add new employee
        Employee newEmp = new Worker(5,"N5","S5",160,22);
        assertTrue(company.addEmployee(newEmp));
        //check size
        assertEquals(5, company.quantity());
        //can't exceed the capacity
        Employee oneMoreEmp = new Worker(6,"N6","S6",160,22);
        assertFalse(company.addEmployee(oneMoreEmp));
        company.printEmployee();
    }

    @Test
    void removeEmployeeTest() {
        // can remove existed
        assertEquals( emp[1], company.removeEmployee(2));
        // check size
        assertEquals( 3, company.quantity() );
        // can't remove absent
        assertNull(company.removeEmployee(7));
    }

    @Test
    void findEmployeeTest() {
        //find existed
        assertEquals(emp[2], company.findEmployee(3));
        //find absent
        assertNull(company.findEmployee(9));
    }

    @Test
    void updateEmployeeTest() {
    }

    @Test
    void quantityTest() {
        assertEquals(4, company.quantity());
    }

    @Test
    void printEmployeeTest() {
        company.printEmployee();
        //методы типа void не проверяется с помощью assert
    }

    @Test
    void totalSalaryTest() {
    }

    @Test
    void totalSalesTest() {
    }

    @Test
    void findEmployeeHoursGreaterThanTest() {
    }

    @Test
    void findEmployeeSalaryRangeTest() {
    }
}
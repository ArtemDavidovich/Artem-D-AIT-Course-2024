package homework_29.ait.employee.dao;

import homework_29.ait.employee.model.Employee;

//- добавление сотрудника +
//- нахождение сотрудника по id +
//- обновление cотрудника +
//- удаление сотрудника +
//- печать списка сотрудников +
//- кол-во сотрудников +
//- объем ФОТ
//- объем продаж

public interface Company {

    boolean addEmployee (Employee employee);

    Employee removeEmployee (int id);

    Employee findEmployee (int id);

    Employee updateEmployee(Employee employee, int id);

    int quantity();

    void printEmployee();

    double totalSalary();

    double averageSalary();

    double totalSales();

    Employee[] findEmployeeHoursGreaterThan(int hours);

    Employee[] findEmployeeSalaryRange(double min, double max);

    Employee[] findEmployeeSalesValue(double salesValue);

}

package homework_29.ait.employee.dao;

import homework_29.ait.employee.model.Employee;
import homework_29.ait.employee.model.SalesManager;

import java.util.function.Predicate;

public class CompanyImpl implements Company{

    private Employee[] employees;
    private int size;

    //capacity
    public CompanyImpl(int capacity){
        this.employees = new Employee[capacity];
        this.size = 0;
    }

    @Override
    public boolean addEmployee(Employee employee) {
        if(employee == null){
            return false;
        }
        if(!(findEmployee(employee.getId()) == null)){
            return false;
        }
        if(size == employees.length) {
            return false;
        }
//        if (employee == null || size >= employees.length || findEmployee(employee.getId()) != null) {
//            return false;
//        }
        employees[size] = employee;
        size++;
        return true;
    }

    @Override
    public Employee removeEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if(employees[i].getId() == id){
                Employee victim = employees[i];
                employees[i] = employees[size - 1]; // на место жертвы ставим (копируем) последний элемент массива
                employees[size - 1] = null; // последний элемент затрем с помощью null
                size--;
                return victim;
            }
        }
        return null;
    }

    @Override
    public Employee findEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if(employees[i].getId() == id){
                return employees[i];
            }
        }
        return null;
    }

    @Override
    public Employee updateEmployee(Employee employee, int id) {
        return null;
    }

    @Override
    public int quantity() {
        return size;
    }

    @Override
    public void printEmployee() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    @Override
    public double totalSalary() {
        double totalSalary = 0;
        for (int i = 0; i < size; i++) {
            totalSalary += employees[i].calcSalary();
        }
        return totalSalary;
    }

    @Override
    public double averageSalary() {
        return totalSalary() / size;
    }

    @Override
    public double totalSales() {
        double totalSales = 0;
        for (int i = 0; i < size; i++) {
            if(employees[i] instanceof SalesManager){
                totalSales += ((SalesManager) employees[i]).getSalesValue();
            }
        }
        return totalSales;
    }

    @Override
    public Employee[] findEmployeeHoursGreaterThan(int hours) {
        return findEmployeesByPredicate(employee -> employee.getHours() > hours);
    }

    @Override
    public Employee[] findEmployeeSalaryRange(double min, double max) {
        return findEmployeesByPredicate(employee -> employee.calcSalary() >= min && employee.calcSalary() <= max);
    }

    @Override
    public Employee[] findEmployeeSalesValue(double salesValue) {
        return findEmployeesByPredicate(employee -> employee instanceof SalesManager && ((SalesManager) employee).getSalesValue() == salesValue);
    }


    private Employee[] findEmployeesByPredicate(Predicate<Employee> predicate){
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(predicate.test(employees[i])){
                count++;
            }
        }
        Employee[] res = new Employee[count];
        for (int i = 0, j = 0; j < res.length; i++) {
            if(predicate.test(employees[i])){
                res[j++] = employees[i];
            }
        }
        return res;
    }

}//end of class

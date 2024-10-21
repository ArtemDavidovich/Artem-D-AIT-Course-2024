package classwork_27.ait.employee.dao;

import classwork_27.ait.employee.model.Employee;

public class CompanyImpl implements Company{

    private Employee[] employees;
    private int size;

    //capacity
    public CompanyImpl(int capacity){
        this.employees = new Employee[capacity];
        this.size = size;
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
        return 0;
    }

    @Override
    public double totalSales() {
        return 0;
    }

    @Override
    public Employee[] findEmployeeHoursGreaterThan(int hours) {
        return new Employee[0];
    }

    @Override
    public Employee[] findEmployeeSalaryRange(double min, double max) {
        return new Employee[0];
    }


}//end of class

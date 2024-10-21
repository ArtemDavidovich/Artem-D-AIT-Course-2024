package classwork_28.ait.employee.model;

public class Worker extends Employee{

    private int grade;

    public Worker(int id, String name, String surname, double hours, int grade) {
        super(id, name, surname, hours);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Worker{");
        sb.append("grade=").append(grade);
        sb.append(", id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", surname='").append(surname).append('\'');
        sb.append(", hours=").append(hours);
        sb.append('}');
        return sb.toString();
    }

    public double calcSalary(){
        double salary = grade * hours;
        return ensureSalary(salary);
    }
}

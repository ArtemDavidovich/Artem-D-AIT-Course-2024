package classwork_32.ait.employee.model;

public class SalesManager extends Employee{

    private double salesValue;
    private double percent;

    public SalesManager(int id, String name, String surname, double hours, double salesValue, double percent) {
        super(id, name, surname, hours);
        this.salesValue = salesValue;
        this.percent = percent;
    }

    public double getSalesValue() {
        return salesValue;
    }

    public void setSalesValue(double salesValue) {
        this.salesValue = salesValue;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SalesManager{");
        sb.append("salesValue=").append(salesValue);
        sb.append(", percent=").append(percent);
        sb.append(", id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", surname='").append(surname).append('\'');
        sb.append(", hours=").append(hours);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double calcSalary() {
        double salary = salesValue * percent;
        return ensureSalary(salary);
    }
}

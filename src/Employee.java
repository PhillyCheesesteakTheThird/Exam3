public abstract class Employee extends Person {
    public String department;
    public double salary;
    public String hiringDate;

    public Employee(String name, String address, String phoneNumber, String emailAddress, String department, double salary, String hiringDate) {
        super(name, address, phoneNumber, emailAddress);
        this.department = department;
        this.salary = salary;
        this.hiringDate = hiringDate;
    }
    @Override
    public String toString() {
        return (super.toString() + '\n' + this.department + '\n' + this.salary + '\n' + this.hiringDate);
    }
}

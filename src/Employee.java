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

    public String getDepartment(){
        return this.department;
    }
    public void setDepartment(String department){
        this.department = department;
    }

    public double getSalary(){
        return this.salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }

    public String getHiringDate() {
        return this.hiringDate;
    }

    public void setHiringDate(String hiringDate) {
        this.hiringDate = hiringDate;
    }
    @Override
    public String toString() {
        return (super.toString() + '\n' + this.department + '\n' + this.salary + '\n' + this.hiringDate);
    }
}

public class Staff extends Employee {
    public String title;

    public Staff(String name, String address, String phoneNumber, String emailAddress, String department, double salary, String hiringDate, String title) {
        super(name, address, phoneNumber, emailAddress, department, salary, hiringDate);
        this.title = title;
    }

    @Override
    public String toString() {
        return (super.toString() + '\n' + this.title);
    }
}

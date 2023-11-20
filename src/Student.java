public class Student extends Person {
    public String status;

    public Student(String name, String address, String phoneNumber, String emailAddress, String status) {
        super(name, address, phoneNumber, emailAddress);
        this.status = status;

    }

    @Override
    public String toString() {
        return (super.toString() + '\n' + this.status);
    }
}

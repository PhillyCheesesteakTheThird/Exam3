public class Faculty extends Employee {
    public String officeHours;
    public String rank;

    public Faculty(String name, String address, String phoneNumber, String emailAddress, String department, double salary, String hiringDate, String officeHours, String rank) {
        super(name, address, phoneNumber, emailAddress, department, salary, hiringDate);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return this.officeHours;
    }

    public void setOfficeHours(String OfficeHours) {
        this.officeHours = officeHours;
    }


    public String getRank() {
        return this.rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }


    @Override
    public String toString() {
        return (super.toString() + '\n' + this.officeHours + '\n' + this.rank);
    }
}

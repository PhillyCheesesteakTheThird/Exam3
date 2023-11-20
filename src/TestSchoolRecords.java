import java.util.ArrayList;

public class TestSchoolRecords {
    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Student("Harry Potter", "102 Harry Potter St.", "123123123123", "harriestpotter@gmail.com", "Senior"));
        personList.add(new Student("Ron Weselton", "120 Weselton Ave.", "321321321321", "weseltown@gmail.com", "Sophomore"));
        personList.add(new Faculty("Patricia Dompledisker", "123 Temporal Dr.", "4564564565", "gremlingrasper@outlook.com", "Mathematics", 12.03, "12-01-89", "9 AM - 5PM", "Senior"));
        personList.add(new Faculty("Raccoon Jenkins", "451 Dumpster Dr.", "77777777777", "dumpsterdiver@outlook.com", "English", 15.06, "8-21-05", "9 PM - 6 AM", "Junior"));
        personList.add(new Staff("Saline Solution", "Salty Dr.", "4321235667", "saltysamuel@gmail.com", "Physics", 6.66, "03-17-05", "Associate Professor"));
        personList.add(new Staff("Casey Jones", "Powder St.", "911", "drivinthattrain@gmail.com", "Chemistry", 15.09, "07-12-05", "Professor"));

        for (Person person : personList) {
            System.out.println(person.toString() + '\n');
        }

        for (Person employee : returnEmployee(personList)) {
            System.out.println(employee.toString() + '\n');
        }

    }

    public static ArrayList<Person> returnEmployee(ArrayList<Person> personList) {
        ArrayList<Person> employeeList = new ArrayList<>();
        for (Person person : personList) {
            if (person instanceof Employee) {
                employeeList.add(person);
            }
        }

        return employeeList;
    }
}

public class HourlyEmployee extends Employee {
    private int wage;
    private int hoursWorked;

    public HourlyEmployee(String firstName, String lastName, String socialSecurity, int wage, int hoursWorked) {
        super(firstName, lastName, socialSecurity);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getWage() {
        return wage;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }
}

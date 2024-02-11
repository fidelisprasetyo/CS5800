public abstract class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurity;

    public Employee(String firstName, String lastName, String socialSecurity) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurity = socialSecurity;
    }

    public abstract void printEmployeeData();

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSocialSecurity(String socialSecurity) {
        this.socialSecurity = socialSecurity;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurity() {
        return socialSecurity;
    }
}

public class Human {
    public String lastName = "Ivanov";
    public String firstName = "Ivan";
    public String middleName = "Ivanovich";
    public String dateOfBirth = "01.01.1970";
    public String sex = "Man";

    public void whoAmI() {
        System.out.println("LastName: " + lastName + "\nFirstName: " + firstName + "\nMiddleName: " + middleName
                + "\nDate of Birth: " + dateOfBirth + "\nSex: " + sex);
    }

    public Human() {
    }

    public Human(String lastName, String firstName, String middleName, String dateOfBirth, String sex) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
    }
}

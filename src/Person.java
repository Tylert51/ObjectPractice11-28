public class Person {
    private String firstName;
    private String lastName;
    private String email;

    public Person(String fName, String lName) {
        firstName = fName;
        lastName = lName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void changeEmail(String newEmail) {
        newEmail = email;
    }

    public String getEmail() {
        return email;
    }

    public void introduce() {
        System.out.println("Hello, my name is " + getFirstName() + " " + getLastName());
    }
}


public class Name {
    private String firstName;
    private String middleName;
    private String lastName;

    public Name(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }
    public String toString(){
        return ("Name: " + firstName + " " + middleName + " " + lastName);
    }
}

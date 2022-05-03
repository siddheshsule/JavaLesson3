package inheritanceExample;

public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public String getFirstName(){
        return firstName;

    }

    public String getLastName(){
        return lastName;
    }

    public void setFirstName(String newFirstName){
        this.firstName = newFirstName;

    }
    public void setLastName(String newLastName){
        this.lastName = newLastName;
    }

    @Override
    public String toString() {
        return ("First Name: " + firstName + "\n" + "Last Name: " + lastName);
    }
}

package hwOOP;

public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void getFullName(){
        System.out.println(firstName + " " + lastName);
    }



}

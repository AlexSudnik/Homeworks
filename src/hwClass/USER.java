package hwClass;

public enum USER {

    USER1("Иванов", "Иван", 30, "Муж"),
    USER2("Петров", "Петр", 33, "Муж"),
    USER3("Сидорова", "Анна", 35, "Жен");

    private String firstName;
    private String lastName;
    private int age;
    private String gender;

    USER(String lastName, String firstName, int age, String gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public void printaddress(){
        Address address = new Address("bel", "vit");// откуда сама подтягивается переменная address?
        address.print();
    }


    public class Address{
        private String country;
        private String city;

        public Address (String country, String city){
            this.country=country;
            this.city=city;
        }
        public void print(){
            System.out.println(country + " " + city);
        }
//     А что дальше?
    }


}

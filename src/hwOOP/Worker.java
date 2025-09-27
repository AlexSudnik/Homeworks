package hwOOP;

public class Worker extends Employee{
    public Worker(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override           //"В класса Worker и Director реализовать метод,
    // который устанавливает тип сотрудника (из enum)." это так делается?
    // или этот метод делает что -то другое?
    public void setProf() {
        this.prof = PROF.WORKER;
    }



}

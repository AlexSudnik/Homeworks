package hwOOP;

public abstract class Employee extends Person {

    protected int workExp;
    private int basic = 1000;
    protected PROF prof;                 // что это значит - маленькое prof?

    public Employee(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public int getSalary(){
        return basic * prof.getCoef() * workExp; // что такое prof здесь перед getcoef
    }

    public abstract void setProf();

    @Override                     //зачем мы это делаем?
    public String toString() {
        return "Employee{" +
                "workExp=" + workExp +
                ", prof=" + prof +
                ", salary="+ getSalary() +
                '}';
    }
}

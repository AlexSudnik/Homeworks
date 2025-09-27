package hwOOP;

import java.util.Arrays;
import java.util.Objects;

public class Director extends Employee{

    private  Employee[] employees;


    public Director(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public void addWorker (Employee employee){      //откуда взялось employee (с маленькой)
        if (Objects.isNull(employees)){
            employees = new Employee[1];
            employees[0]=employee;
        } else {
            employees = Arrays.copyOf(employees, employees.length +1);
            employees[employees.length-1] = employee;
        }

    }

    @Override                    //зачем мы это делаем-переопределяем?
    public void setProf(){
        this.prof = PROF.DIRECTOR;
    }
}

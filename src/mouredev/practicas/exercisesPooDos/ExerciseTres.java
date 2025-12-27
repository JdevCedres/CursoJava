package mouredev.practicas.exercisesPooDos;

public class ExerciseTres {
    static void main(String[] args) {
        var employeeUno = new Employee();
        employeeUno.name = "Elena";
        employeeUno.salary = 12345.67;
        var employeeDos = new Manager();
        employeeDos.name = "Manuel";
        employeeDos.salary = 43222.34;
        employeeDos.Department = "RRHH";
    }

    public static class Employee{
        String name;
        double salary;
    }

    public static class Manager extends Employee{
        String Department;

    }
}

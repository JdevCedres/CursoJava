package mouredev.practicas.exercisesPooDos;



public class ExerciseUno {
    static void main(String[] args) {
        var study = new Student();
        study.name = "Manuel";
        study.age = 7;
        study.grade = 12.3;
        study.metodoStudy();
    }

    public static class Person{
        String name;
        int age;


    }

    public static class Student extends Person{
        double grade;

        public void metodoStudy(){
            System.out.println("Me llamo: " + name + " y tengo " + age + " años. Y mi nota es: " + grade);
        }

    }
}

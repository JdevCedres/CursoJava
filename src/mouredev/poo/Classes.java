package mouredev.poo;

public class Classes {
    static void main(String[] args) {

        var person = new Person("Jose", 48, "123A");
        var person2 = new Person("Manuel", 7, "4321B");
        var person3 = new Person("Elena", 6, "4565E");
        var person4 = new Person("Adrian", 15, "1221");
        var person5 = new Person("Aitana", 12, "12344");
        //person.name = "Jose";
        //person.age = 48;
        person.sayHello();
        // person.name ="Manuel";
         System.out.println(person.name);
         System.out.println(person.getId());
         person4.setAge(16);
        System.out.println(person4.getAge());
        person2.sayHello();
        Person.dataPerson();
    }
}

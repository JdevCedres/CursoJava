package mouredev.practicas.exercisesPooUno;

public class Practice {
    static void main(String[] args) {
        var book = new Book("Star Word, episode 1", "George lucas");
        book.data();
        System.out.println(book.getTitle());
        var dog = new Dog();
        dog.bark();
        var car = new Car("Toyota", "Celica");
        car.showData();
        var student = new Student();
        student.grades(53.00f);
        var cuenta = new BankAccount();
        cuenta.deposit(1289.98);
        cuenta.deposit(1000);
        cuenta.withdraw(1000);
        cuenta.withdraw(2000);
        cuenta.deposit(1200);
        var rectangle = new Rectangle(4, 2);
        rectangle.area();
        rectangle.perimetro();
        var product = new Product(-1234.56);
        System.out.println(product.getPrice());
        var temperature = new Temperature();
        temperature.setCelsius(-14);
        var user1 = new User("jdev", "jose");
        user1.checkPassword("jos");
        user1.setPassword("jos");
        user1.checkPassword("jos");
    }
}

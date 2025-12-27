package mouredev.practicas.exercisesPooUno;

public class Product {
    private double price;

    public Product(double price){
        this.setPrice(price);
    }

    public void setPrice(double price){
        if (price > 0) {
           this.price = price;
        }else {
            System.out.println("Precio invalido ");
        }
    }

    public double getPrice(){
        return price;
    }
}

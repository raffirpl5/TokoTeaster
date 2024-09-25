package Toko;


public class Product {
    private int number;
    private String name;
    private int quantity;
    private double price;

    public Product() {
        number = 2;
        name = "Reborn";
        quantity = 12;
        price = 2000.0;
    }

    public Product(int number, String name, int quantity, double price) {
        //variable class = parameter method
        this.number = number;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }   

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void print() {
        System.out.println("Number = " + number);
        System.out.println("Name = " + name);
        System.out.println("Quantity = " + quantity);
        System.out.println("Price = " + price);
    }


    

    
}

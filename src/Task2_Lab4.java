import javax.smartcardio.Card;

class Car{
    private String model;
    private String brand;
    private String color;
    private int year;
    private int price;
    private int quantity;

    public Car(String model, String brand, String color, int year, int price, int quantity) {
        this.model = model;
        this.brand = brand;
        this.color = color;
        this.year = year;
        this.price = price;
        this.quantity = quantity;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void delivery(int amount) {
        quantity += amount;
        System.out.println(amount + " cars delivered. New quantity: " + quantity);
    }

    public void sell(int amount) {
        if (amount > quantity) {
            System.out.println("Not enough cars in stock to sell!");
        } else {
            quantity -= amount;
            System.out.println(amount + " cars sold. Remaining quantity: " + quantity);
        }
    }

    public String toString() {
        return "Car Details:\n" +
                "Model: " + model + "\n" +
                "Brand: " + brand + "\n" +
                "Color: " + color + "\n" +
                "Year: " + year + "\n" +
                "Price: " + price + "\n" +
                "Quantity: " + quantity + "\n";
    }

}

public class Task2_Lab4 {
    public static void main(String[] args) {
        Car car1 = new Car("M4","BMW","black",2015,200000,5);

        System.out.println(car1.toString());

        car1.sell(2);

        System.out.println("\nAfter selling:");
        System.out.println("Model: " + car1.getModel());
        System.out.println("Brand: " + car1.getBrand());
        System.out.println("Color: " + car1.getColor());
        System.out.println("Year: " + car1.getYear());
        System.out.println("Price: " + car1.getPrice());
        System.out.println("Quantity: " + car1.getQuantity());

        car1.setColor("Red");
        car1.setPrice(210000);
        car1.delivery(3);

        System.out.println("\nAfter updates:");
        System.out.println(car1.toString());
    }
}

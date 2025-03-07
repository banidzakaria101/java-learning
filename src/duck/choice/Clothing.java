package duck.choice;

public class Clothing {

    private String description;
    private double price;
    private String size;
    private final int minimumPrice = 10;
    private final double tax = 0.2;


    public double getPrice() {
        return price + (price * tax);
    }

    public void setPrice(double price) {
        if (price < minimumPrice) {
            this.price = price;
        } else this.price = minimumPrice;

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

}

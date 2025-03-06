package duck.choice;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double tax = 0.2;
        double total;
        int measurement = 6;

        Customer c1 = new Customer();
        c1.name ="pink";
        System.out.println(c1.name);
        String string = "HELLO WORLD";
        System.out.println(string.indexOf("O"));

        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();

        item1.description = "Blue Jacket";
        item1.price = 20.9;
        item1.size = "M";
        item2.description = "Orange T-shirt";
        item2.price = 10.5;
        item2.size = "S";

        System.out.println("the price of " + item1.description + "is " + item1.price + "and the size is " + item1.size);
        System.out.println("the price of " + item2.description + "is " + item2.price + "and the size is " + item2.size);

        total = (item1.price + item2.price*2) * (1+tax);

        System.out.println(total);

        //practice switch statement:
        Customer c2 = new Customer();
        c2.name ="pinky";
        c2.size = "S";

        switch (measurement) {
            case 1,2,3:
                c2.size = "S";
                break;
            case 4,5,6:
                c2.size = "M";
                break;
            case 7,8,9:
                c2.size = "L";
                break;
            default:
                c2.size ="x";
        }

        System.out.println("the size of the customer " + c2.name + "is " + c2.size);

    }
}
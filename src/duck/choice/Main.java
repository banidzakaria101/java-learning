package duck.choice;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double tax = 0.2;
        double total = 0.0;
        int measurement = 6;

        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        Clothing item3 = new Clothing();
        Clothing item4 = new Clothing();

        item1.setDescription("Blue Jacket");
        item1.setPrice(20.9);
        item1.setSize("M");
        item2.setDescription("Orange T-shirt");
        item2.setPrice(10.5);
        item2.setSize("S");
        item3.setDescription("Green Scarf");
        item3.setPrice(5.0);
        item3.setSize("S");
        item4.setDescription("Blue T-shirt");
        item4.setPrice(10.5);
        item4.setSize("S");

        Customer c1 = new Customer();
        c1.setName("pink");
        System.out.println(c1.getName());
        String string = "HELLO WORLD";
        System.out.println(string.indexOf("O"));
        Customer c2 = new Customer();
        c2.setName("pinky");
        c2.setSize(3);

        System.out.println("the size of the customer is: " + c2.getSize());


        //practice switch statement:
        Clothing[] items = {item1, item2, item3, item4};
        c1.addItems(items);
        for (Clothing item : items) {
            System.out.println("The customer is " + c1.getName() + "and the total price is " + item.getPrice());
            System.out.println(total);

//        System.out.println("the price of " + item1.description + "is " + item1.price + "and the size is " + item1.size);
//        System.out.println("the price of " + item2.description + "is " + item2.price + "and the size is " + item2.size);
//
//        total = (item1.price + item2.price*2) * (1+tax);

//        System.out.println(total);

            //practice switch statement:


//        switch (measurement) {
//            case 1,2,3:
//                c2.size = "S";
//                break;
//            case 4,5,6:
//                c2.size = "M";
//                break;
//            case 7,8,9:
//                c2.size = "L";
//                break;
//            default:
//                c2.size ="x";
//        }
//
//        System.out.println("the size of the customer " + c2.name + "is " + c2.size);
//
//
//        //practicing loops
//        //using if statement to control flow
//        for (Clothing item : items) {
//            System.out.println("the size of " + item.getDescription() + " is " + item.getSize());
//            if(c2.getSize().equals(item.getSize())) {
//                total = total + item.getPrice();
//                if ( total>15){
//                    break;
//                }
//            }
//        }
//        System.out.println(total);


        }
    }
}
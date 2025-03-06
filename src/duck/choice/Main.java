package duck.choice;

import java.lang.reflect.Array;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double tax = 0.2;
        double total = 0.0;
        int measurement = 6;

        Customer c1 = new Customer();
        c1.name ="pink";
        System.out.println(c1.name);
        String string = "HELLO WORLD";
        System.out.println(string.indexOf("O"));
        Customer c2 = new Customer();
        c2.name ="pinky";
        c2.size = "S";

        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        Clothing item3 = new Clothing();
        Clothing item4 = new Clothing();

        item1.description = "Blue Jacket";
        item1.price = 20.9;
        item1.size = "M";
        item2.description = "Orange T-shirt";
        item2.price = 10.5;
        item2.size = "S";
        item3.description = "Green Scarf";
        item3.price = 5.0;
        item3.size = "S";
        item4.description = "Blue T-shirt";
        item4.price = 10.5;
        item4.size = "S";

        //practice switch statement:
        Clothing[] items = {item1, item2, item3, item4};



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


        //practicing loops
        //using if statement to control flow
        for (Clothing item : items) {
            System.out.println("the price of " + item.description + "is " + item.price + " and the size is " + item.size);
            if(c2.size.equals(item.size)) {
                total = total + item.price;
                if ( total>15){
                    break;
                }
            }
        }
        System.out.println(total);

    }
}
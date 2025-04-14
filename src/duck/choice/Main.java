package duck.choice;


import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double tax = 0.2;
        double total = 0.0;
        int measurement = 6;
        double sum = 0.0;
        int counter = 0;
        double average = 0.0;
//        int maxValue = Math.max(20,99);
//        int minValue = Math.min(20,99);
//        System.out.println("the max value is :" + maxValue);
//        System.out.println("the min value is :" + minValue);
        double roundUp = Math.round(99.435);
        double roundDown = Math.round(99.565);
        System.out.println(roundUp);
        System.out.println(roundDown);
        System.out.println(Clothing.minimumPrice);

        Clothing item1 = new Clothing("Blue Jacket",20.9,"M");
        Clothing item2 = new Clothing("Orange T-shirt",10.5,"S");
        Clothing item3 = new Clothing("Green Scarf",5.0,"S");
        Clothing item4 = new Clothing("Blue T-shirt",10.5,"S");

//        item1.setDescription("Blue Jacket");
//        item1.setPrice(20.9);
//        item1.setSize("M");
//        item2.setDescription("Orange T-shirt");
//        item2.setPrice(10.5);
//        item2.setSize("S");
//        item3.setDescription("Green Scarf");
//        item3.setPrice(5.0);
//        item3.setSize("S");
//        item4.setDescription("Blue T-shirt");
//        item4.setPrice(10.5);
//        item4.setSize("S");

        Customer c1 = new Customer("pink",20);
//        c1.setName("pink");
        System.out.println(c1.getName());
//        String string = "HELLO WORLD";
//        System.out.println(string.indexOf("O"));
//        Customer c2 = new Customer("pinky");
//        c2.setName("pinky");
//        c2.setSize(3);
//
        System.out.println("the size of the customer " + c1.getName() + " is: " + c1.getSize());


        //practice switch statement:
        Clothing[] items = {item1, item2, item3, item4};

        for(Clothing item : items){
            System.out.println(item);
        }
        c1.addItems(items);
        System.out.println("The customer is " + c1.getName() + "and the total price is " + c1.getClothingCost());
        for (Clothing item : c1.getItems()) {
            System.out.println("items for the customer " + c1.getName() + " are " + item.getDescription());
        }

        for (Clothing item : c1.getItems()) {
            if (item.getSize().equals("L")) {
                counter++;
                sum += item.getPrice();
            }

        }

        if ( counter > 0){
            average = sum / counter;
        }else {
            System.out.println("You can not divide by zero");
        }

        //compare Clothing description
        Arrays.sort(items);
        for(Clothing item : items){
            System.out.println(item);
        }


//        try {
//            average = sum/counter;
//            System.out.println("The average price of the customer " + c1.getName() + " is " + average + " and count is " + counter);
//        } catch (ArithmeticException e) {
//            System.out.println("You can not divide by zero");
//        }

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
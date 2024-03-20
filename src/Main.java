import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

     Item i = new Item(200, "Fancy biscuits");

     Item i2 = new Item(300, "Fancy Chocolate");

     Item i3 = new Item(400, "Kitty Kibble");

     //System.out.println(i.toString());

     Transaction t = new Transaction();
     t.addItem(i);
     t.addItem(i2);
     t.addItem(i3);

     t.getNumbersOfItems();

     System.out.println(t.getNumbersOfItems());
     t.cancelLastItem();
     System.out.println(t.getNumbersOfItems());

     //System.out.println(t.getSubTotal());

     //System.out.println(t.pay(1000));








    }
}
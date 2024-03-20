public class Item {


private int price;

private String description;

public Item(int aPrice, String aDescription) {

    this.price = aPrice;

    this.description = aDescription;

}

public int getPrice(){

    return this.price;
}

public String getDescription() {

    return this.description;
}

public String toString(){

return  "An item of " + this.getClass() + " with description " + this.getDescription() + " and price " + this.getPrice();

}

}

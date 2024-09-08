class FRUIT {
    String color;
    String taste;
    int price;

    public void display() {
        System.out.printf("\nColor: %s\nTaste: %s\nPrice: %d\n",color,taste,price);
    }
}

public class W7Q1 {
    public static void main(String[] args) {
        FRUIT mango = new FRUIT();
        mango.color = "Yellow";
        mango.taste = "Sweet";
        mango.price = 50;
        mango.display();

        FRUIT apple = new FRUIT();
        apple.color = "Red";
        apple.taste = "Sweet";
        apple.price = 100;
        apple.display();

        FRUIT pear = new FRUIT();
        pear.color = "Green";
        pear.taste = "Mild and sweet";
        pear.price = 40;
        pear.display();
    }   
}
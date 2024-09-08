class FRUIT {
    String color;
    String taste;
    int price;

    public void setDetails(String c, String t, int p) {
        this.color = c;
        this.taste = t;
        this.price = p;
    }

    public void display() {
        System.out.printf("\nColor: %s\nTaste: %s\nPrice: %d\n",color,taste,price);
    }
}

public class W7Q2 {
    public static void main(String[] args) {
        FRUIT mango = new FRUIT();
        mango.setDetails("Yellow", "Sweet", 50);
        mango.display();

        FRUIT apple = new FRUIT();
        apple.setDetails("Red", "Sweet", 100);
        apple.display();

        FRUIT pear = new FRUIT();
        pear.setDetails("Green", "Mild and sweet", 40);
        pear.display();
    }   
}
class FRUIT {
    String color;
    String taste;
    int price;

    public void display() {
        System.out.printf("\nColor: %s\nTaste: %s\nPrice: %d\n",color,taste,price);
    }

    public FRUIT(String col, String tas, int prc) {
        this.color = col;
        this.taste = tas;
        this.price = prc;
    }
}

public class W7Q3 {
    public static void main(String[] args) {
        FRUIT mango = new FRUIT("Yellow","Sweet",50);
        mango.display();

        FRUIT apple = new FRUIT("Red","Sweet",100);
        apple.display();

        FRUIT pear = new FRUIT("Green","Mild and Sweet",40);
        pear.display();
    }   
}
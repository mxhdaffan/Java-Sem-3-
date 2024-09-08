class FRUIT {
    String color;
    String taste;
    int price;

    public void display() {
        System.out.printf("\nColor: %s\nTaste: %s\nPrice: %d\n",color,taste,price);
    }

    public FRUIT(String col) {      // 1 argument
        this.color = col;
    }
    public FRUIT(String tas, int prc) {     // 2 argument
        this.taste = tas;
        this.price = prc;
    }
    public FRUIT(String col, String tas, int prc) {     // 3 argument
        this.color = col;
        this.taste = tas;
        this.price = prc;
    }
}

public class W7Q4 {
    public static void main(String[] args) {
        FRUIT mango = new FRUIT("Yellow");
        mango.taste = "Sweet";
        mango.price = 50;
        mango.display();

        FRUIT apple = new FRUIT("Sweet",100);
        apple.color = "Red";
        apple.display();

        FRUIT pear = new FRUIT("Green","Mild and Sweet",40);
        pear.display();
    }   
}
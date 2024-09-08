class VEHICLE {
    public int price;

    public void cost(int cos) {
        this.price = cos;
    }
}

class Bus extends VEHICLE {
    public void display() {
        System.out.println("Price of Bus: " + price);
    }
}

class Train extends VEHICLE {
    public void display() {
        System.out.println("Price of Train: " + price);
    }
}

public class W8Q1 {
    public static void main(String[] args) {
        Bus b1 = new Bus();
        Train t1 = new Train();

        b1.cost(1000000);
        t1.cost(5000000);
        b1.display();
        t1.display();

    }   
}
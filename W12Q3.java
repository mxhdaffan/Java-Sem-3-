interface Bike {
    public void offer();
    default public void details() {
        System.out.println("\nViewing bike details");
    }
}

interface Scooty {
    public void offer();
    default public void details() {
        System.out.println("\nViewing scooty details");
    }
}

class BuySomething implements Bike, Scooty {
    @Override
    public void offer() {
        System.out.println("\nOffering price: 50k");
    }

    @Override
    public void details() {
        Bike.super.details();
        Scooty.super.details();
    }
}

public class W12Q3 {
    public static void main(String[] args) {
        BuySomething bs = new BuySomething();
        bs.offer();
        bs.details();
    }
}

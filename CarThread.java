public class CarThread implements Runnable {
    final String brand;
    final String model;
    final double price;

    public CarThread(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void run() {
        // while (true) {
            System.out.println("hello my name is " + this.brand);
            // Thread.sleep(300);
        // }
    }

    public static void main(String[] args) {
        CarThread audi = new CarThread("Audi", "A3"); 
        CarThread porsche = new CarThread("Porsche", "911"); 
        audi.run();
        porsche.run();
        System.out.println("carThreads are running... ");
    }

}
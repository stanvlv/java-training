public class HorizontalThread extends Thread {
    public void run() {
        if (Math.random() < 0.5) {
            System.out.println("Moving left");
        } else {
            System.out.println("Moving right");
        }
    }
}
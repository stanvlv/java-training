public class VerticalThread extends Thread {
    public void run() {
        if (Math.random() < 0.5) {
            System.out.println("Moving forward");
        } else {
            System.out.println("Moving back");
        }
    }
}
import java.util.Random;
import java.util.Scanner;

public class Robot {
    private HorizontalThread moveX;
    private VerticalThread moveY;

    public Robot() {
        this.moveX = new HorizontalThread();
        this.moveY = new VerticalThread();
    }

     public void move(int numMoves) {
        Random random = new Random();
        for (int i = 0; i < numMoves; i++) {
            if (random.nextBoolean()) {
                moveX.run();
            } else {
                moveY.run();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many moves should the robot do: ");
        int numMoves = scanner.nextInt();

        Robot robot = new Robot();
        robot.move(numMoves);

        scanner.close();
    }
}

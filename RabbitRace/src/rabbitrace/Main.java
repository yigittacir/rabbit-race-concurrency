package rabbitrace;

import java.util.Scanner;

public class Main {

    public static Box[] boxes;
    public static int rabbitCount;
    public static int boxCount;
    public static int x, y, z;
    public static boolean gameOver = false;
    public static int finishedRabbits = 0;

    public static synchronized void rabbitFinished() {
        finishedRabbits++;
        if (finishedRabbits == rabbitCount) {
            System.out.println("Game Over!");
            gameOver = true;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Rabbit count: ");
        rabbitCount = sc.nextInt();

        System.out.print("Box count: ");
        boxCount = sc.nextInt();

        System.out.print("Carrot generation time (X): ");
        x = sc.nextInt();

        System.out.print("Carrot expire time (Y): ");
        y = sc.nextInt();

        System.out.print("Rabbit sleep time (Z): ");
        z = sc.nextInt();

        boxes = new Box[boxCount];
        for (int i = 0; i < boxCount; i++) {
            boxes[i] = new Box(i);
        }

        new Thread(new Person()).start();
        new Thread(new CarrotRemover()).start();

        for (int i = 0; i < rabbitCount; i++) {
            new Thread(new Rabbit("Rabbit-" + (i + 1))).start();
        }
    }
}

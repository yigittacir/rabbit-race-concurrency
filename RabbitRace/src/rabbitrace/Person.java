package rabbitrace;

import java.util.Random;

public class Person implements Runnable {

    private Random random = new Random();

    @Override
    public void run() {
        while (!Main.gameOver) {
            int box = random.nextInt(Main.boxCount);
            Carrot carrot = new Carrot(System.currentTimeMillis());
            Main.boxes[box].putCarrot(carrot);

            try {
                Thread.sleep(Main.x);
            } catch (InterruptedException ignored) {
            }
        }
    }
}

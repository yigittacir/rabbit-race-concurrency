package rabbitrace;

public class CarrotRemover implements Runnable {

    @Override
    public void run() {
        while (!Main.gameOver) {
            for (Box box : Main.boxes) {
                box.removeExpired(Main.y);
            }

            try {
                Thread.sleep(50);
            } catch (InterruptedException ignored) {
            }
        }
    }
}

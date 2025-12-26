package rabbitrace;

public class Rabbit implements Runnable {

    private String name;
    private int currentBox = 0;
    private int score = 0;

    public Rabbit(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (!Main.gameOver && currentBox < Main.boxCount - 1) {
            eatCarrot();

            try {
                Thread.sleep(Main.z);
            } catch (InterruptedException ignored) {}

            currentBox++;
            System.out.println(name + " jumps to box " + currentBox);
        }

        System.out.println(name + " score: " + score);
        Main.rabbitFinished();
    }

    private void eatCarrot() {
        Carrot carrot = Main.boxes[currentBox].takeCarrot();
        if (carrot != null) {
            score++;
            System.out.println(name + " eats carrot in box " + currentBox);
        }
    }
}

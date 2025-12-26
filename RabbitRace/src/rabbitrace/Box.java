package rabbitrace;

public class Box {

    private int id;
    private Carrot carrot;

    public Box(int id) {
        this.id = id;
    }

    public synchronized boolean putCarrot(Carrot carrot) {
        if (this.carrot == null) {
            this.carrot = carrot;
            return true;
        }
        return false;
    }

    public synchronized Carrot takeCarrot() {
        Carrot temp = carrot;
        carrot = null;
        return temp;
    }

    public synchronized void removeExpired(long limit) {
        if (carrot != null && System.currentTimeMillis() - carrot.getTime() >= limit) {
            System.out.println("Carrot expired in box " + id);
            carrot = null;
        }
    }
}

package L1dub2;

public class Cat implements Movable, Participant{

    private final int maxDistance;
    private final int maxHeight;

    private boolean canParticipate = true;

    public Cat(int maxDistance, int maxHeight) {
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
    }

    @Override
    public void run() {
        System.out.println("Кошка бежит");
    }

    @Override
    public void jump() {
        System.out.println("Кошка прыгает");
    }

    public boolean canParticipate() {
        return canParticipate;
    }

    @Override
    public void cannotParticipate() {
        canParticipate = !canParticipate;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public int getMaxHeight() {
        return maxHeight;
    }
}

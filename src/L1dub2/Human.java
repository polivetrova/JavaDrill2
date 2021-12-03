package L1dub2;

public class Human implements Movable, Participant{

    private final int maxDistance;
    private final int maxHeight;
    protected boolean canParticipate = true;


    public Human(int maxDistance, int maxHeight) {
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
    }

    @Override
    public void run() {
        System.out.println("Человек бежит");
    }

    @Override
    public void jump() {
        System.out.println("Человек прыгает");
    }

    public boolean canParticipate() {
        return canParticipate;
    }

    @Override
    public void cannotParticipate() {
        canParticipate = !canParticipate;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public int getMaxDistance() {
        return maxDistance;
    }
}

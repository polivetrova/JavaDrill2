package L1dub2;

public class Robot implements Movable, Participant{

    private final int maxDistance;
    private final int maxHeight;
    protected boolean canParticipate = true;


    public Robot(int maxDistance, int maxHeight) {
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
    }

    @Override
    public void run() {
        System.out.println("Робот бежит");
    }

    @Override
    public void jump() {
        System.out.println("Робот прыгает");
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

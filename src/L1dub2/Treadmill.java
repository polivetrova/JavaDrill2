package L1dub2;

public class Treadmill implements Obstacles{

    private final int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    public void doObstacle(Participant part){
        if(part instanceof Movable && ((Movable) part).getMaxDistance() >= distance ){
            ((Movable) part).run();
        } else {
            System.out.println("Не получилось пробежать");
            part.cannotParticipate();
        }
    }
}

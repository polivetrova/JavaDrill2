package L1dub2;

public class Wall implements Obstacles{

    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    public void doObstacle(Participant part){
        if(part instanceof Movable && ((Movable) part).getMaxHeight() >= height ){
            ((Movable) part).jump();
        } else {
            System.out.println("Не получилось перепрыгнуть");
            part.cannotParticipate();
        }
    }
}

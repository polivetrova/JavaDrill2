package L1;

public interface Movable {

    default void run(){
        System.out.println(this.toString() + "бежит");
    }
    default void jump(){
        System.out.println(this.toString() + "прыгает");
    }

    void doObstacle(Treadmill treadmill);
    void doObstacle(Wall wall);
}

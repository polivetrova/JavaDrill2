package L1dub2;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat(150,5);
        Human human = new Human(100, 2);
        Robot robot = new Robot(200,0);

        Participant[] parts = {cat, human, robot};

        Treadmill tm = new Treadmill(120);
        Wall wall = new Wall(2);

        Obstacles[] obstacles = {tm, wall};

        for (Obstacles obstacle : obstacles) {
            for (Participant part : parts) {
                if(part.canParticipate()) {
                    obstacle.doObstacle(part);
                } else {
                    System.out.println("Участник выбывает");
                }
            }
        }
    }
}

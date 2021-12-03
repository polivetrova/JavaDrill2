package L1;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Robot robot = new Robot();
        Human human = new Human();

        Treadmill treadmill = new Treadmill();
        Wall wall = new Wall();


//        treadmill.runTreadmill(cat);
//        wall.jumpWall(cat);

//        treadmill.runTreadmill(cat);
//        treadmill.runTreadmill(human);
//        treadmill.runTreadmill(robot);
//
//        wall.jumpWall(cat);
//        wall.jumpWall(human);
//        wall.jumpWall(robot);

        Movable[] parties = new Movable[3];
        parties[0] = new Cat();
        parties[1] = new Human();
        parties[2] = new Robot();

        Obstacles[] obstacles = new Obstacles[2];
        obstacles[0] = treadmill;
        obstacles[1] = wall;

        for (Object obstacle : obstacles) {
            for (Movable party : parties) {
                if(obstacle instanceof Treadmill) {
                    party.doObstacle(treadmill);
                } else if (obstacle instanceof Wall){
                    party.doObstacle(wall);
                }
            }
            //obstacle.doObstacle(party)
            //party.doObstacle(obstacle)
            //party.jumpWall();

            // вернуть методы в участников, переименовать их там в дуобстакл и сделать ссылки на описание метода в классах обстакл


        }




//        /*var parties = new Object[3];
//        parties[0] = new Cat();
//        parties[1] = new Human();
//        parties[2] = new Robot();*/
//
//        var obstacles = new Object[2];
//        obstacles[0] = treadmill;
//        obstacles[1] = wall;



    }

}

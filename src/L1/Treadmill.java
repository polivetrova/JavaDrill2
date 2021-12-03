package L1;

public class Treadmill extends Obstacles{

    public Treadmill(){}



//    public void doTreadmill(Cat cat, Human human, Robot robot){
//        cat.runTreadmill();
//        human.runTreadmill();
//        robot.runTreadmill();
//    }

    /*private int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }*/

    public void runTreadmill(Cat cat){
       if(cat.getCanRunTreadmill()){
           cat.run();
       }else{
           System.out.println(cat.toString() + "не добежал");
       }
    }

    public void runTreadmill(Human human){
       if(human.getCanRunTreadmill()){
           human.run();
       }else{
           System.out.println(human.toString() + "не добежал");
       }
    }

    public void runTreadmill(Robot robot){
       if(robot.getCanRunTreadmill()){
           robot.run();
       }else{
           System.out.println(robot.toString() + "не добежал");
       }
    }

//    public void runTreadmill(Movable creature) {
//        if(creature.getCanRunTreadmill()){
//            creature.run();
//        }else{
//            System.out.println(creature.toString() + "не добежал");
//        }
//    }
}

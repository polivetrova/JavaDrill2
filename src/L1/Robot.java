package L1;

import java.util.Random;

public class Robot implements Movable{

    Random random = new Random();

    boolean canRunTreadmill = random.nextBoolean();
    boolean canJumpWall = random.nextBoolean();

    public Robot(){
    }

    public boolean getCanRunTreadmill(){
        return canRunTreadmill;
    }
    public boolean getCanJumpWall(){
        return canJumpWall;
    }

//    public void runTreadmill(){
//        if(canRunTreadmill){
//            run();
//        }else{
//            System.out.println(this + "не добежал");
//        }
//    }
//
//    public void jumpWall(){
//        if(canJumpWall){
//            jump();
//        } else{
//            System.out.println(this + "не допрыгнул");
//        }
//    }

    @Override
    public String toString(){
        return "Робот ";
    }

    @Override
    public void doObstacle(Treadmill treadmill) {
        treadmill.runTreadmill(this);
    }

    @Override
    public void doObstacle(Wall wall) {
        wall.jumpWall(this);
    }
}

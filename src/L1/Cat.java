package L1;

import java.util.Random;

public class Cat implements Movable{

    Random random = new Random();

    boolean canRunTreadmill = random.nextBoolean();
    boolean canJumpWall = random.nextBoolean();

    public Cat(){
    }

    public boolean getCanRunTreadmill(){
        return canRunTreadmill;
    }

    public boolean getCanJumpWall(){
        return canJumpWall;
    }



//    public void runTreadmill(){
//       if(canRunTreadmill){
//           run();
//       }else{
//           System.out.println(this + "не добежал");
//       }
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
        return "Котик ";
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

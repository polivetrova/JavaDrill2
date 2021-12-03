package L1;

public class Wall extends Obstacles {

    public Wall(){}

    public void jumpWall(Cat cat){
        if(cat.getCanJumpWall()){
            cat.jump();
        } else{
            System.out.println(cat.toString() + "не допрыгнул");
        }
    }

    public void jumpWall(Human human){
        if(human.getCanRunTreadmill()){
            human.jump();
        } else {
            System.out.println(human.toString() + "не допрыгнул");
        }
    }

    public void jumpWall(Robot robot){
        if(robot.getCanRunTreadmill()){
            robot.jump();
        } else {
            System.out.println(robot.toString() + "не допрыгнул");
        }
    }

}

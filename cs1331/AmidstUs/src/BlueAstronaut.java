import java.util.Arrays;

public class BlueAstronaut extends Player implements Crewmate{
    private int numTasks;
    private int taskSpeed;

    public BlueAstronaut(String name, int susLevel, int numTasks, int taskSpeed){
        super(name, susLevel);
        this.setNumTasks(numTasks);
        this.setTaskSpeed(taskSpeed);
    }

    public BlueAstronaut(String name){
        this(name, 15, 6, 10);
    }
    public int getNumTasks() {
        return numTasks;
    }

    public void setNumTasks(int numTasks) {
        if(numTasks < 0){
            this.numTasks = 0;
        }
        else{
            this.numTasks = numTasks;
        }
    }

    public int getTaskSpeed() {
        return taskSpeed;
    }

    public void setTaskSpeed(int taskSpeed) {
        if(taskSpeed > 0){
            this.taskSpeed = taskSpeed;
        }
    }

    @Override
    public void completeTask() {
        if(!this.isFrozen() && this.getNumTasks() > 0){
            if(this.taskSpeed > 20){
                if(this.getNumTasks() - 2 <= 0){
                    System.out.println("I have completed all my tasks");
                    this.setSusLevel(this.getSusLevel() / 2);
                }
                this.setNumTasks(this.getNumTasks() - 2);
            }
            else {
                if(this.getNumTasks() - 1 <= 0){
                    System.out.println("I have completed all my tasks");
                    this.setSusLevel(this.getSusLevel() / 2);
                }
                this.setNumTasks(this.getNumTasks() - 1);
            }
        }
    }

    @Override
    protected void emergencyMeeting() {
        if(!this.isFrozen()){
            Arrays.sort(Player.getPlayers());
//            for(Player p: Player.getPlayers()){
//                System.out.println(p);
//            }
//            System.out.println("Current player calling meeting: ");
//            System.out.println(this);

            if(Player.getPlayers()[Player.getPlayers().length - 1].getSusLevel() != this.getSusLevel()){

//                System.out.println(Player.getPlayers()[Player.getPlayers().length - 1].isFrozen());
//                System.out.println(Player.getPlayers()[Player.getPlayers().length - 1].getSusLevel());
//                System.out.println(Player.getPlayers()[Player.getPlayers().length - 1].getSusLevel() != this.getSusLevel());
                Player.getPlayers()[Player.getPlayers().length - 1].setFrozen(true);
//                System.out.println(Player.getPlayers()[Player.getPlayers().length - 1].isFrozen());
            }
        }
        super.gameOver();
    }

    public boolean equals(Object o){
        if(o instanceof RedAstronaut){
            BlueAstronaut ba = (BlueAstronaut) o;
            return this.getName().equals(ba.getName()) &&
                    this.isFrozen() == ba.isFrozen() &&
                    this.getSusLevel() == ba.getSusLevel() &&
                    this.getNumTasks() == ba.getNumTasks() &&
                    this.getTaskSpeed() == ba.getTaskSpeed();
        }
        return false;
    }

    @Override
    public String toString(){
        String res = super.toString() + "I have " + this.getNumTasks() + " left over.";
        if(this.getSusLevel() > 15){
            return res.toUpperCase();
        }
        return res;
    }
}

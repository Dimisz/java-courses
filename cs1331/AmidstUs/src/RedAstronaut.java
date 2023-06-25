import java.util.Arrays;

public class RedAstronaut extends Player implements Impostor{

    private String skill;

    public RedAstronaut(String name, int susLevel, String skill){
        super(name, susLevel);
        this.skill = skill;
    }

    public RedAstronaut(String name){
        this(name, 15, "experienced");
    }

    @Override
    protected void emergencyMeeting() {
        if(!this.isFrozen()){
            Arrays.sort(Player.getPlayers());
            if(!Player.getPlayers()[Player.getPlayers().length - 1].equals(this)){
                if(Player.getPlayers()[Player.getPlayers().length - 1].getSusLevel() != this.getSusLevel()){
                    Player.getPlayers()[Player.getPlayers().length - 1].setFrozen(true);
                }
            }
        }
        super.gameOver();
    }

    @Override
    public void freeze(Player p) {
        if(!this.isFrozen() && !p.isFrozen()){
            if(!(p instanceof Impostor)){
                if(this.getSusLevel() < p.getSusLevel()){
                    p.setFrozen(true);
                }
                else{
                    setSusLevel(getSusLevel() * 2);
                }
            }
        }
        super.gameOver();
    }

    @Override
    public void sabotage(Player p) {
        if(!this.isFrozen() && !p.isFrozen()){
            if(!(p instanceof Impostor)){
                if(this.getSusLevel() < 20){
                    int newSusLevel = p.getSusLevel() + (p.getSusLevel() / 2);
                    p.setSusLevel(newSusLevel);
                }
                else{
                    int newSusLevel = p.getSusLevel() + (p.getSusLevel() / 4);
                    p.setSusLevel(newSusLevel);
                }
            }
        }
    }

    public boolean equals(Object o){
        if(o instanceof RedAstronaut){
            RedAstronaut ra = (RedAstronaut) o;
            return this.getName().equals(ra.getName()) &&
                    this.isFrozen() == ra.isFrozen() &&
                    this.getSusLevel() == ra.getSusLevel() &&
                    this.getSkill().equals(ra.getSkill());
        }
        return false;
    }

    @Override
    public String toString(){
      String res = super.toString() + "I am an " + this.getSkill() + " player!";
        if(this.getSusLevel() > 15){
            return res.toUpperCase();
        }
        return res;
    }

    public String getSkill(){
        return this.skill;
    }

    public void setSkill(String skill){
        this.skill = skill;
    }
}

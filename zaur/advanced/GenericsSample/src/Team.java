import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team <T extends Participant>{
    private String name;
    private List<T> participants = new ArrayList<>();

    public Team(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void addNewParticipant(T p){
        participants.add(p);
        System.out.println("A new participant " + p.getName() + " has joined the " +
                this.name + " team");
    }

    public void playWith(Team team){
        String winnerName;
        Random random = new Random();
        int i = random.nextInt(2);
        if(i == 0){
            winnerName = this.name;
        }
        else {
            winnerName = team.getName();
        }

        System.out.println("The winner is " + winnerName + ".");
    }
}

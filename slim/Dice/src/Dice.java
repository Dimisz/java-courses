public class Dice {
    private int sum;

    public Dice(){
        this.sum = rollDice();
    }

    private int rollDice(){
        int collector = 0;
        for(int i = 0; i < 3; i++){
            collector += new Die().getFaceValue();
            //System.out.println("Temp value: " + collector);
        }
        return collector;
    }

    public int getSum(){
        return this.sum;
    }
}

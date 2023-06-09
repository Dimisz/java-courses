import java.util.Random;

public class Die {
    public static final int SIDES = 6;
    private int faceValue;
    private Random rand;

    public Die(){
        faceValue = 1;
        rand = new Random();
    }

    public int roll(){
        faceValue = rand.nextInt(SIDES) + 1;
        return faceValue;
    }

    public int getFaceValue(){
        return faceValue;
    }

    public String toString(){
        return "Die with face value: " + faceValue;
    }
}
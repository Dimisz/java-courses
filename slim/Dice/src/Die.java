public class Die {
    private int faceValue;

    public Die(){
        this.faceValue = (int)(Math.random() * 6) + 1;
//        System.out.println("new die with a value of: " + this.faceValue);
    }

    public int getFaceValue(){
        return this.faceValue;
    }
}

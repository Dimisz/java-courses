public class Pet extends Animal{
    private int tail;
    private int paw;

    public Pet(int tail, int paws){
        super(2);
        this.paw = paws;
        this.tail = tail;
        System.out.println("A pet with " + tail + " tails and " + paw + " paws created");
    }

    public void getInfo(){
        super.getInfo();
        System.out.println("And a pet with " + tail + " tails and " + paw + " paws.");
    }

    public void run() {
        System.out.println("Pet runs");
    }

    public void jump(){
        System.out.println("Pet jumps");
    }
}

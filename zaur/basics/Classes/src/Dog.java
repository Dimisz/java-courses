public class Dog extends Pet{
    private String name;
    public Dog(String name){
        super(1, 4);
        this.name = name;
        System.out.println("A Dog with the name " + this.name + " created.");
    }

    public void getInfo(){
        System.out.println("I am a dog and my name is " + this.name);
        super.getInfo();
    }

    public void play(){
        System.out.println("Dog plays.");
    }
}

public class Cat extends Pet{
    private String name;
    public Cat(String name){
        super(1, 4);
        this.name = name;
        System.out.println("I am a cat and my name is " + this.name);
    }

    public void getInfo(){
        System.out.println("I am a cat and my name is " + this.name);
        super.getInfo();
    }

    public void sleep(){
        System.out.println("Cat sleeps...");
    }
}

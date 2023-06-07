public class Animal {
    private int eyes;
    public Animal(int eyes){
        this.eyes = eyes;
        System.out.println("An animal with " + eyes + " eyes created.");
    }

    public void eat(){
        System.out.println("Animal eats...");
    }

    public void drink(){
        System.out.println("Animal drinks...");
    }

    public void getInfo(){
        System.out.println("Animal has " + eyes + " eyes");
    }
}

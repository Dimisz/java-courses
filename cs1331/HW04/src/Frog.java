public class Frog {
    private String name;
    private int age;
    private double tongueSpeed;
    private boolean isFroglet;

    public static String getSpecies() {
        return species;
    }

    public static void setSpecies(String species) {
        Frog.species = species;
    }

    private static String species = "Rare Pepe";

    public Frog(String name, int age, double tongueSpeed){
        this.name = name;
        this.age = age;
        this.isFroglet = (age > 1 && age < 7);
        this.tongueSpeed = tongueSpeed;
    }

    public Frog(String name, double ageInYears, double tongueSpeed){
        this(name, (int)(ageInYears * 12), tongueSpeed);
    }

    public Frog(String name){
        this(name, 5, 5);
    }


    public void grow(int numMonths){
        int count = 0;
        while(count < numMonths){
            if(this.age < 12){
                this.tongueSpeed += 1.0;
            }
            else if(this.age >= 30){
                if(this.tongueSpeed - 1 >= 5){
                    this.tongueSpeed -= 1;
                }
            }
            this.age++;
            this.isFroglet = (this.age > 1 && this.age < 7);
            count++;
        }
    }

    public void grow(){
        this.grow(1);
    }

    public void eat(Fly fly){
        if(!fly.isDead()){
            if(this.tongueSpeed > fly.getSpeed()){
                if(fly.getMass()  >= (this.age / 2)){
                    this.grow();
                    fly.setMass(0);
                }
            }
            else {
                fly.grow(1);
            }
        }
    }

    @Override
    public String toString() {
        if(this.isFroglet){
            return "My name is " + this.name + " and I'm a rare froglet! I'm " +
                    this.age + " months old and my tongue has a speed of " +
                    this.tongueSpeed + ".";
         }
        else{
            return "My name is " + this.name + " and I'm a rare frog. I'm " + this.age +
                    " months old and my tongue has a speed of " + String.format("%.2f", this.tongueSpeed) + ".";
         }
    }
}

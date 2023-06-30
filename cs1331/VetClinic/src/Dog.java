public class Dog extends Pet{
    private double droolRate;

    public Dog(String name, double health, int painLevel, double droolRate){
        super(name, health, painLevel);
        if(droolRate <= 0){
            this.droolRate = 0.5;
        }
    }

    public Dog(String name, double health, int painLevel){
        this(name, health, painLevel, 5.0);
    }

    public double getDroolRate() {
        return droolRate;
    }

    @Override
    public void speak() {
        super.speak();
        String barking = "";
        for(int i = 0; i < this.getPainLevel(); i++){
            barking += "bark ";
        }
        barking = barking.trim();
        if(this.getPainLevel() > 5){
            barking = barking.toUpperCase();
        }
        System.out.println(barking);
    }

    @Override
    public int treat() {
        this.heal();
        if(this.getDroolRate() < 3.5){
            return (int) ((this.getPainLevel() * 2) / this.getHealth());
        }
        else if(this.getDroolRate() >= 3.5 || this.getDroolRate() <= 7.5){
            return (int) (this.getPainLevel() / this.getHealth());
        }
        else {
            return (int) (this.getPainLevel()/ (this.getHealth() * 2));
        }
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Dog){
            Dog dog = (Dog) o;
            return super.equals(o) && dog.getDroolRate() == this.getDroolRate();
        }
        return false;
    }
}

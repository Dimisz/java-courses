public class Cat extends Pet{
    private int miceCaught;

    public Cat(String name, double health, int painLevel, int miceCaught){
        super(name, health, painLevel);
        if(miceCaught < 0){
            this.miceCaught = 0;
        }
        else{
            this.miceCaught = miceCaught;
        }
    }

    public Cat(String name, double health, int painLevel){
        this(name, health, painLevel, 0);
    }

    public int getMiceCaught() {
        return miceCaught;
    }

    @Override
    public int treat() {
        int time = 0;
        if(this.getMiceCaught() < 4){
            time = (int)((this.getPainLevel() * 2) / this.getHealth());
        }
        else if(this.getMiceCaught() >= 4 && this.getMiceCaught() <= 7){
            time =  (int)(this.getPainLevel() / this.getHealth());
        }
        else {
            time = (int)(this.getPainLevel() / (this.getHealth() * 2));
        }
        super.heal();
        return time;
    }

    @Override
    public void speak() {
        super.speak();
        String meowing = "";
        for(int i = 0; i < this.getMiceCaught(); i++){
            meowing += "meow ";
        }
        meowing = meowing.trim();
        if(this.getPainLevel() > 5){
            meowing = meowing.toUpperCase();
        }
        System.out.println(meowing);
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Cat){
            Cat cat = (Cat) o;
            return super.equals(o) && cat.getMiceCaught() == this.getMiceCaught();
        }
        return false;
    }
}

public class Fly {
    private double mass;
    private double speed;

    public Fly(double mass, double speed){
        this.mass = mass;
        this.speed = speed;
    }

    public Fly(double mass){
        this(mass, 10);
    }

    public Fly(){
        this(5, 10);
    }
    // setters
    public void setMass(double mass) {
        this.mass = mass;
    }

    public void setSpeed(double speed){
        this.speed = speed;
    }

    //getters
    public double getMass() {
        return mass;
    }

    public double getSpeed() {
        return speed;
    }

    @Override
    public String toString(){
        if(this.mass == 0){
            return "I'm dead, but I used to be a fly with a speed of " + this.speed + ".";
        }
        else{
            return "I'm a speedy fly with " + String.format("%.2f", this.speed) + " speed and " +
                    String.format("%.2f", this.mass) + " mass.";
        }
    }


    public void grow(int addedMass){
        if(addedMass > 0){
            int count = 0;
            while(count < addedMass) {
                this.mass += 1;
                if (this.mass <= 20) {
                    this.speed += 1;
                } else {
                    this.speed -= 0.5;
                }
//            this.mass += addedMass;
                count++;
            }
        }
    }

    public boolean isDead(){
        return this.mass <= 0;
    }
}

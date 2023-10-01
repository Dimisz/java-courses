public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Point(){
        this(0, 0);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(Point otherPoint){
        return Math.sqrt((otherPoint.getX() - x) * (otherPoint.getX() - x) + (otherPoint.getY() - y) * (otherPoint.getY() - y));
    }

    public double distance(){
        return this.distance(new Point(0, 0));
    }

    public double distance(int x, int y){
        return this.distance(new Point(x, y));
    }


}

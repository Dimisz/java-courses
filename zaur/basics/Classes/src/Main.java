public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Tom");
        cat1.sleep();
        cat1.getInfo();
        System.out.println();
        Dog dog1 = new Dog("Lucky");
        dog1.getInfo();
        dog1.play();

    }
}
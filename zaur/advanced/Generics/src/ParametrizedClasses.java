public class ParametrizedClasses {
    public static void main(String[] args) {
//        Info<String> info1 = new Info<>("Hi there");
//        System.out.println(info1);
//
//        Info<Integer> info2 = new Info<>(23);
//        System.out.println(info2);

        Pair<String, Integer> pair1 = new Pair<>("Hello there", 42);
        System.out.println(pair1);

        Pair<Double, String> pair2 = new Pair<>(156.66, "Second value");
        System.out.println(pair2);

     }
}

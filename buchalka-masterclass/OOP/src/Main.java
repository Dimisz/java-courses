public class Main {
    public static void main(String[] args) {
//        for(int i = 0; i <= 5; i++){
//            LPAStudent s = new LPAStudent("S92300" + i,
//                    switch(i){
//                        case 1 -> "Mary";
//                        case 2 -> "Carol";
//                        case 3 -> "Tim";
//                        case 4 -> "Harry";
//                        case 5 -> "Lisa";
//                        default -> "Anonymous";
//                    },
//                    "05/11/1985",
//                    "Java Masterclass"
//                    );
//            System.out.println(s);
//        }
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());


    }
}
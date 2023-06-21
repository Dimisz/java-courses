public class WhileLoop {
    public static boolean isEven(int num){
        return num % 2 == 0;
    }

    public static void printEvens(){
        int i = 5;
        int count = 0;

        while(i < 21){
            if(isEven(i)) {
                System.out.println(i);
                count++;
            }
            i++;
            if(count == 5) break;
        }
        System.out.println("Found " + count + " even numbers");
    }
}

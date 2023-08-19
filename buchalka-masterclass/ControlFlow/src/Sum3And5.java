public class Sum3And5 {
    public static int getSumOfNumbersEvenlyDividedBy3And5(){
        int sum = 0;
        int count = 0;
        for(int i = 1; count < 5 && i < 1001; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println(i);
                sum += i;
                count++;
            }
        }
        return sum;
    }
}

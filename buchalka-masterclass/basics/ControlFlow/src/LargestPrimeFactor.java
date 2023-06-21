public class LargestPrimeFactor {
    public static int getLargestPrime(int num){
        if(num <= 1){
//            System.out.println("invalid input");
            return -1;
        }

        //get factors
        for(int i = num; i > 0; i--){
            if(num % i == 0){
                if(i == 2){
                    return i;
                }
                else{
                    int count = 0;
                    for(int j = 2; j < i; j++){
                        if(i % j == 0){
                            count++;
                        }
                    }
                    if(count == 0) return i;
                }
            }
        }
        return -1;
    }
}

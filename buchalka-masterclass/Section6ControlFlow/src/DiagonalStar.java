public class DiagonalStar {
    public static void printSquareStar(int num){
        if(num < 5){
            System.out.println("Invalid Value");
        }
        else{
            for(int i = 1; i <= num; i++){
                if(i == 1 || i == num){
                    for(int k = 0; k < num; k++){
                        System.out.print("*");
                    }
                }
                else{
                    for(int j = 1; j <= num; j++){
                        if(j == 1 || j == num || j == i || i == num - j + 1){
                            System.out.print("*");
                        }
                        else {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println();

            }
        }
    }
}

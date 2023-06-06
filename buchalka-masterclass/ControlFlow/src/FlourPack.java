public class FlourPack {
    public static boolean canPack(int bigBags, int smallBags, int goal){
        if(bigBags < 0 || smallBags < 0 || goal < 0){
            return false;
        }
        if((bigBags * 5) + (smallBags) == goal){
//            System.out.println("true: exact match");
            return true;
        }
        else if((bigBags * 5) + (smallBags) < goal){
//            System.out.println("false: not enough bags");
            return false;
        }
        else{
            for(int big = 0; big <= bigBags; big++){
                for(int small = 0; small <= smallBags; small++){
                    if((big * 5) + small == goal){
//                        System.out.println("true: some bags left unused");
                        return true;
                    }
                }
            }
//            System.out.println("false : just false");
            return false;
        }
    }
}

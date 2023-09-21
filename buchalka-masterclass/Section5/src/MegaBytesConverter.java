public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }
        else {
            int kiloBytesInAMegaByte = 1024;
            int megaBytes = kiloBytes / kiloBytesInAMegaByte;
            int remainingKiloBytes = kiloBytes % kiloBytesInAMegaByte;
            System.out.println(kiloBytes + " KB = " + megaBytes +
                    " MB and " + remainingKiloBytes + " KB");
        }
    }
}

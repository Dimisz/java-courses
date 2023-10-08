public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex){
        this.tonerLevel = (tonerLevel >=0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount){
        if(tonerAmount > 0 && tonerAmount <= 100){
            if(tonerLevel + tonerAmount <= 100){
                tonerLevel += tonerAmount;
                return tonerLevel;
            }
            else{
                return -1;
            }
        }
        else{
            return -1;
        }
    }

    public int printPages(int pages){
        if(pages >= 0){
            int pagesToPrint = pages;
            if(duplex){
                pagesToPrint = pages / 2;
                if(pages % 2 != 0) pagesToPrint += 1;
                System.out.println("Printing in duplex mode");
            }
            this.pagesPrinted += pagesToPrint;
            return pagesToPrint;
        }
        return -1;
    }

    public int getPagesPrinted(){
        return this.pagesPrinted;
    }
}

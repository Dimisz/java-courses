public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex){
        if(tonerLevel < 0 || tonerLevel > 100){
            this.tonerLevel = 0;
        }
        else {
            this.tonerLevel = tonerLevel;
        }

        if(pagesPrinted < 0){
            this.pagesPrinted = 0;
        }
        else{
            this.pagesPrinted = pagesPrinted;
        }

        this.duplex = duplex;
    }

    public Printer(int tonerLevel, boolean duplex){
        this(tonerLevel, 0, duplex);
    }

    public Printer(boolean duplex){
        this(100, duplex);
    }

    public Printer(){
        this(false);
    }

    public int addToner(int tonerAmount){
        if(tonerAmount <= 0 || tonerAmount > 100){
//            System.out.println("Cannot add a negative amount of toner");
            return -1;
        }
        else {
            if(this.tonerLevel + tonerAmount > 100){
                return -1;
            }
            else{
                this.tonerLevel += tonerAmount;
//                System.out.println("Toner topped up to " + this.tonerLevel + "%");
                return this.tonerLevel;
            }
        }
    }

    public int printPages(int numPages){
        if(numPages < 0){
//            System.out.println("Cannot unprint the previously printed pages...");
            return -1;
        }
        else{
            int sheetsOfPaperUsed = numPages;
//            System.out.println("Printing...");
            if(this.duplex){
                System.out.println("Printing in duplex mode");
                sheetsOfPaperUsed = (numPages / 2) + (numPages % 2);
                this.pagesPrinted += sheetsOfPaperUsed;
            }
            else{
                this.pagesPrinted += sheetsOfPaperUsed;
            }
            return sheetsOfPaperUsed;
        }
    }

    public int getPagesPrinted(){
        return this.pagesPrinted;
    }
}

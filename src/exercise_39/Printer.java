package exercise_39;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel;
        if(this.tonerLevel < -1 || this.tonerLevel > 100){
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount){
        if(tonerAmount <= 0 || tonerAmount > 100){
            return -1;
        }
        int newTonerLevel = tonerAmount + this.tonerLevel;

        if (newTonerLevel > 100){
            return -1;
        }
        this.tonerLevel = newTonerLevel;
        return tonerLevel;
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if (this.duplex){
            pagesToPrint = (int)Math.ceil(pagesToPrint / 2.0);
        }


        return pagesToPrint;
    }


    public int getPagesPrinted(){
        return this.pagesPrinted;
    }


}

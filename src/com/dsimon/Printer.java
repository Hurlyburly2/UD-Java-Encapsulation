package com.dsimon;

public class Printer {
    private Toner toner;
    private int numberOfPagesPrinted;
    private boolean duplex;

    public Printer(boolean duplex) {
        this.toner = new Toner("HUrasdjfiwR");
        this.numberOfPagesPrinted = 0;
        this.duplex = duplex;
    }

    public void fillToner(int howMuchToFill) {
        fillToner(howMuchToFill);
    }

    public void printPages(int pages) {
        if (duplex == false) {
            numberOfPagesPrinted += pages;
            System.out.println(pages + "pages printed");
        } else {
            int duplexPagesPrinted = (pages / 2) + (pages % 2);
            numberOfPagesPrinted += duplexPagesPrinted;
            System.out.println(duplexPagesPrinted + " pages printed");
        }
    }

    public int getTonerLevel() {
        return toner.getHowFull();
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }
}

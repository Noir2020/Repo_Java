package Class7;

public class DoubleSide {

    // This class is for code which will allow me to print double sided pages.
    // This class can be extended with Printer class



    private static int pages = 100;
    private static int toner = 100;
    int pagesToPrint;
    int pagesRequired;
    int tonerRequired;




    // Print
    public void printDoubleSide(int pagesToPrint) {
        if (pagesToPrint % 2 == 0) {
            pagesRequired = pagesToPrint / 2;
            tonerRequired = pagesToPrint;

            pages -= pagesRequired;
            toner -= tonerRequired;
        } else {
            pagesRequired = pagesToPrint / 2 + 1;
            tonerRequired = pagesToPrint;

            pages -= pagesRequired;
            toner -= tonerRequired;
            System.out.println("You printed " + pagesRequired + " pages double sided");
        }
    }

}

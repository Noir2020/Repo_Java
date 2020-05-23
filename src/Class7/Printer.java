package Class7;

public class Printer extends DoubleSide {

    // Create a printer

    // toner = 100
    // pages in tray = 100
    // with 1 page printing, 1 toner is being used

    // Required actions:
    // 1. addToner
    // 2. addPages
    // 3. Print (Single and Double)
    // 4. PrinterSummary
    //        Toner level:
    //        Pages count in tray:
    // 5. checkToner
    //        if toner is less than 10; it should warn to "Add toner"




    private static int pages = 100;
    private static int toner = 100;
    int pagesToLoad;
    int tonerToLoad;
    int pagesRequired;
    int tonerRequired;
    int pagesToPrint;


    // Add toner
    public int addToner(int tonerToLoad) {
        if (tonerToLoad > 0 && tonerToLoad <= 100) {
            if ((tonerToLoad + toner) <= 100) {
                toner = toner + tonerToLoad;
            } else {
                System.out.println("You are trying to load more amount of toner than its capacity");
            }
        } else {
            System.out.println("Invalid amount of toner to add");
        }
        return toner;
    }



    // Add pages
    public int addPages(int pagesToLoad) {
        if (pagesToLoad > 0 && pagesToLoad <= 100) {
            if ((pagesToLoad + pages) <= 100) {
                pages = pages + pagesToLoad;
            } else {
                System.out.println("You are trying to load more pages than printer capacity");
            }
        } else {
            System.out.println("Invalid pages to add");
        }
        return pages;
    }



    // Print
    public void printSingleSide(int pagesToPrint) {
        pagesRequired = pagesToPrint;
        tonerRequired = pagesToPrint;

        pages -= pagesRequired;
        toner -= tonerRequired;
        System.out.println("You printed " + pagesRequired + " pages single sided");
    }



    // Printer Summary
    public void printerSummary() {
        System.out.println("Toner level: " + toner);
        System.out.println("Pages count in tray: " + pages);
    }



    // Check toner
    public int checkToner(int toner) {
        if (toner == 0) {
            System.out.println("Out of toner");
        } else if (toner < 10) {
            System.out.println("Add toner");
        } else {
            System.out.println("You have enough toner to print");
        }
        return toner;
    }

}

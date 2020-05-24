package Class7;

public class MyMain {

    public static void main(String[] args) {

        Printer p1 = new Printer();
        p1.addToner(32);
        p1.addPages(0);
        p1.print(11,false);
        p1.printerSummary();
        p1.checkToner(80);


        // p1 gets a fresh copy of Printer class for a new user of a printer with:
        // default values for non-static variables
        // latest value for static variables


        Printer p2 = new Printer();
        p2.addToner(0);
        p2.addPages(90);
        p2.print(8,true);
        p2.printerSummary();
        p2.checkToner(47);





        // p2 gets a fresh copy of Printer class for a new user of a printer.
        // With every fresh copy a new user will get an actual/real level of toner and level of paper. So that,
        // he/she can decide right before printing if the level of toner and paper is going to be enough for printing
        // a certain amount of pages they have.
        // If it is not enough, they can refill toner and paper before start printing.



    }
}

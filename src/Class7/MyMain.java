package Class7;

public class MyMain {

    public static void main(String[] args) {

        SingleSidePrint s1 = new SingleSidePrint();

        // s1 gets a fresh copy of SingleSidePrint class for a new user of a printer with:
        // default values for non-static variables
        // latest value for static variables

        SingleSidePrint s2 = new SingleSidePrint();

        // s2 gets a fresh copy of SingleSidePrint class for a new user of a printer.
        // With every fresh copy a new user will get an actual/real level of toner and level of paper. So that,
        // he/she can decide right before printing if the level of toner and paper is going to be enough for printing
        // a certain amount of pages they have.
        // If it is not enough, they can refill toner and paper before start printing.

    }
}

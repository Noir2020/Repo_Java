package Class7;

public class SingleSidePrint {


        // Create a printer

        // max toner level = 100
        // max pages in tray = 100
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


        private int maxTonerLevel = 100;
        private int maxPaperLevel = 100;
        private static int tonerLevel;
        private static int paperLevel;
        private static int pagesPrinted;
        private int paperLoad;


        public void setTonerLevelAfterPrint(int maxTonerLevel) {
            tonerLevel = maxTonerLevel - pagesPrinted;
        }

        public void setPaperLevelAfterPrint(int maxTonerLevel) {
            paperLevel = maxPaperLevel - pagesPrinted;
        }

        public int getTonerLevelAfterPrint() {
            return tonerLevel;
        }

        public int getPaperLevelAfterPrint() {
            return paperLevel;
        }

        public boolean setAddPaper(int pagesPrinted) {
            if(paperLoad < 0 && paperLoad > pagesPrinted ) {
                return false;
            }else{
                return true;
            }

// Add paper code

        }

        public boolean tonerLevelIsEnough(int tonerLevel) {

            if (tonerLevel == 0) {
                System.out.println("Out of toner");
                return false;
            } else if (tonerLevel < 10) {
                System.out.println("Add toner");
                return false;
            } else {
                return true;

            }
        }

        public boolean paperLevelIsEnough(int paperLevel){

            if (paperLevel == 0) {
                System.out.println("Out of paper");
                return false;
            } else if (paperLevel < 10) {
                System.out.println("Low on paper");
                return false;
            } else {
                return true;

            }
        }

        public int print(int pagesToPrint) {

            int pagesPrinted = 0;
            for (int i = 1; i <= pagesToPrint; i++) {
                if (pagesToPrint > 0 && tonerLevelIsEnough(pagesToPrint) && (paperLevelIsEnough(pagesToPrint))) {

                    paperLevel = paperLevel - pagesToPrint;
                    tonerLevel = tonerLevel - pagesToPrint;
                    pagesPrinted++;
                    break;
                }
            }
            return pagesPrinted;
        }

        public void getPrinterSummary(){
            System.out.println("Toner level:" + tonerLevel);
            System.out.println("Paper count in tray:" + paperLevel);
        }

    }





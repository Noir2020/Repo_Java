
// Checking car mode (P, D, N, R)


package Class3;

public class CarMode {

    public static void main(String[] args) {

        /*
         * Checking car mode (P, D, N, R)
         *
         * if car mode is P and "you can park car"
         * if car mode is D drive car
         *      if drive type is Snow, display "You are on Snow mode"
         *      if drive type is Sport, display "You are on Sport mode"
         *      if drive type is Eco, display "You are on Eco mode"
         * if car mode is N you can "you can put car in car wash"
         * if car mode is R you can "you can reverse the car"
         */
/*
        char gear = 'P';
        String driveType1 = "Snow";
        String driveType2 = "Sport";
        String driveType3 = "Eco";



       switch (gear) {
            case 'P':
                System.out.println("You can park car.");
                break;

            case 'D':
                if(driveType1 == "Snow") {
                    System.out.println("Drive car. You are on Snow mode.");

                }else if( driveType2 == "Sport") {
                    System.out.println("Drive car. You are on Sport mode.");

                }else if( driveType3 == "Eco") {
                    System.out.println("Drive car. You are on Eco mode.");

                }else{
                    System.out.println("Select a drive type");
                }
                break;

            case 'N':
                System.out.println("You can put car in car wash.");
                break;

            case 'R':
                System.out.println("You can reverse the car.");
                break;

            default:
                System.out.println("Select the gear.");
            }

    }

}

*/



        char gear = 'P';
        String driveType = "Sport";



        switch (gear) {
            case 'P':
                System.out.println("You can park car.");
                break;
            case 'D':
                if (driveType == "Snow") {
                    System.out.println("Drive car. You are on Snow mode.");

                } else if (driveType == "Sport") {
                    System.out.println("Drive car. You are on Sport mode.");

                } else if (driveType == "Eco") {
                    System.out.println("Drive car. You are on Eco mode.");

                } else {
                    System.out.println("Select a drive type");
                }
                break;
            case 'N':
                System.out.println("You can put car in car wash.");
                break;

            case 'R':
                System.out.println("You can reverse the car.");
                break;

            default:
                System.out.println("Select the gear.");

        }
    }
}

package Class3;

public class CarMode1 {

    public static void main(String[] args) {

        char gear = 'P';
        String driveType = "Snow Sport Eco";
        String[] words = driveType.split(" ");
        int dType = words.length;


        switch(gear) {
            case 'P':
                System.out.println("You can park your car.");
                break;

            case 'D':
                if (dType == 1) {
                    System.out.println("Drive car. You are on: " + words[0]);

                } else if (dType == 2) {
                    System.out.println("Drive car. You are on: " + words[1]);

                } else if (dType == 3) {
                    System.out.println("Drive car. You are on: " + words[2]);

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

 import java.util.Scanner;
public class Footballplayer {
    
        public static void main(String[] args) {
        //TASK 1
        //to declare variable
        String name;
        int age;
        double height;
        double weightlbs;
        int jersey;
        //to declare the take input using scanner class
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the player's name: ");
        name=input.nextLine();

        System.out.print("Enter the player's age: ");
        age=input.nextInt();

        System.out.print("Enter the player's height: ");
        height=input.nextDouble();

        System.out.print("Enter the player's weight: ");
        weightlbs=input.nextDouble();

        System.out.print("Enter the player's jersey number: ");
        jersey=input.nextInt();
        
        // TASK NUMBER TWO

        //declaring constant variables
        double pound=0.45359;
        int meter =100;

        // changing units
        final double POUND = 0.45359237;
        final int METER = 100;

        int heightCm = (int) (height * METER);
        int weightKg = (int) (weightlbs * POUND);

        

        //TASK THREE
        //Selection Statements(if-else)
         String category;
        if (age < 20) {
            category = "Rising Star";
        } else if (age <= 30) {
            category = "Prime Player";
        } else {
            category = "Veteran";
        }
    
        //TASK FOUR
        //Switch Positions
        String position;
        switch (jersey) {

            case 1: position = "Goalkeeper"; break;
            case 2: case 5: position = "Defender"; break;
            case 6: case 8: position = "Midfielder"; break;
            case 7: case 11: position = "Winger"; break;
            case 9: position = "Striker"; break;
            case 10: position = "Playmaker"; break;
            default: position = "Player position is Unknown";
        }
        ///TASK FIVE
        ///attacker status checker
        boolean attacker = (jersey == 7 || jersey == 9 ||
                            jersey == 10 || jersey == 11);
        
        ///TASK SIX
        ///to check eligibility of the player
        boolean eligible = (age >= 18 && age <= 35 && weightKg < 90);

        ///TASK SEVEN
        ///Lineup Decision(using nested If statements)
        
        String lineupDecision ;
        if (category.equals("Prime Player")) {
            if (weightKg < 80) {
                lineupDecision = "Starting Lineup";
            } else {
                lineupDecision = "Bench";
            }
        } else {
            lineupDecision = "Bench";
        }

        ///TASK EIGHT
        ///Final decision on eligilibity of player
         String finalDecision = eligible ? "Player must Play" : "Player must Rest";

         ///TASK NINE
         /// print the players report
        System.out.println("\n--- Player Report ---");
        System.out.println("Player: " + name);
        System.out.println("Age: " + age + " (" + category + ")");
        System.out.println("Height: " + heightCm + "cm");
        System.out.println("Weight: " + weightKg + "kg");
        System.out.println("Jersey: " + jersey);
        System.out.println("Position: " + position);
        System.out.println("Attacker jersey: " + (attacker ? "Yes" : "No"));
        System.out.println("Eligibility: " + (eligible ? "Eligible" : "Not Eligible"));
        System.out.println("Lineup Decision: " + lineupDecision);
        System.out.println("Final Decision: " + finalDecision);

        ///TASK TEN
        /// Unwanted Fall-Through Demo
        System.out.println("\n--- Fall-Through Demo ---");
        switch (jersey) {
            case 2:
                System.out.println("Defender");
            case 6:
                System.out.println("Midfielder");
            case 7:
                System.out.println("Winger");
            default:
                System.out.println("Unknown (fall-through happened!)");
        }

       
    }


    

}

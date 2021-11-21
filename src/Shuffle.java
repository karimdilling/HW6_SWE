import java.util.Scanner;

public class Shuffle {
//    public int cardNumber = 0;
    public int pickCard() {
        /*if (player.type == "computer") return 1 + (int) (100 * Math.random());
        else {
            for (int i = 0; i < 5; i++) {
                cardNumber = 1 + (int) (100 * Math.random());
                System.out.println("Your card number is: " + cardNumber);
                System.out.println("Do you want to shuffle another time? Type 'true' or 'false'.");
                Scanner scanner = new Scanner(System.in);
                boolean userSelected = scanner.nextBoolean();
                if (userSelected) return cardNumber;
            }
            return cardNumber;
        }*/
        return 1 + (int) (100 * Math.random());
    }
}

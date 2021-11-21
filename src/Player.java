import java.util.Scanner;

public class Player {
    String type;
    public int cardNumber;
    BetMoreGame bet = new BetMoreGame();

    public Player(String type) {
        this.type = type;
    }

    public void start() {
        if (this.type.equals("computer")) this.cardNumber = bet.play();
            else {
                for (int i = 0; i < 5; i++) {
                    this.cardNumber = bet.play();
                    if (i < 4) {
                        System.out.println("Your card number is: " + cardNumber);
                        System.out.println("Do you want to shuffle another time? Type 'true' or 'false'.");
                        Scanner scanner = new Scanner(System.in);
                        boolean userSelected = scanner.nextBoolean();
                        if (!userSelected) break;
                    }
                }
            }
    }
}

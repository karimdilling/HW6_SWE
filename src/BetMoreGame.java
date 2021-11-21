public class BetMoreGame {
    Shuffle s = new Shuffle();

    public int play() {
        return s.pickCard();
    }

    public void findWinner(Player computer, Player person) {
        if (computer.cardNumber > person.cardNumber) System.out.println("Computer won!");
        else if (computer.cardNumber == person.cardNumber) System.out.println("Tie!");
        else System.out.println("You won!");
        System.out.println("Computer's card number: " + computer.cardNumber);
        System.out.println("Your card number: " + person.cardNumber);
    }
}

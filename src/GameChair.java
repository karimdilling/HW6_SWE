public class GameChair {
    public static void main(String[] args) {
        Player player1Computer = new Player("computer");
        Player player2Person = new Player("person");
        BetMoreGame bet = new BetMoreGame();

        player1Computer.start();
        player2Person.start();

        bet.findWinner(player1Computer, player2Person);
    }
}

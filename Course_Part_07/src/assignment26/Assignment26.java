package assignment26;

public class Assignment26 {

    public static void main(String[] args) {

        Game checkers = new Game();
        checkers.setTitle("Dammen");

        Player player1 = new Player();
        player1.setName("Mark");
        player1.setScore(21);

        Player player2 = new Player();
        player2.setName("Chantal");
        player2.setScore(29);

        checkers.setPlayer1(player1);
        checkers.setPlayer2(player2);
        checkers.printScoreBoard();

    }

}

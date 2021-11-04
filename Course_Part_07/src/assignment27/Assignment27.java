package assignment27;

public class Assignment27 {

    public static void main(String[] args) {

        Player player1 = new Player("Thomas");
        player1.setScore(33);

        Player player2 = new Player("Yvette");
        player2.setScore(50);

        Game chess = new Game("Schaken", player1, player2);
        chess.printScoreBoard();

    }

}

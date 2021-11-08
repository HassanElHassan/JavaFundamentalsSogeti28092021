package assignment27;

public class Game {

    private String title;
    private Player player1;
    private Player player2;

    public Game(String title, Player player1, Player player2) {
        this.title = title;
        this.player1 = player1;
        this.player2 = player2;
    }

    private String getPlayerNameHighestScore() {
        return player1.getScore() > player2.getScore() ? player1.getName() : player2.getName();
    }

    public void printScoreBoard() {
        System.out.printf("### Scoreboard of the game %s ###%n",
                title);
        System.out.printf("Player one %s has a score of %d%n",
                player1.getName(),
                player1.getScore());
        System.out.printf("Player two %s has a score of %d%n",
                player2.getName(),
                player2.getScore());
        if (player1.getScore() == player2.getScore()) {
            System.out.println("Equal Score!");
        } else {
            System.out.printf("Player %s has the highest score!",
                    getPlayerNameHighestScore());
        }

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

}

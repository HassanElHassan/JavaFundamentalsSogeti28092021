package assignment26;

public class Game {

    private String title;
    private Player player1;
    private Player player2;

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

    public void printScoreBoard() {
        System.out.printf("### Scoreboard of the game %s ###%n",
                title);
        System.out.printf("Player one %s has a score of %d%n",
                player1.getName(),
                player1.getScore());
        System.out.printf("Player two %s has a score of %d%n",
                player2.getName(),
                player2.getScore());
    }

}

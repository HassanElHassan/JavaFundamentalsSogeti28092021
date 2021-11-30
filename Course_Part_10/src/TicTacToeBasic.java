import java.sql.Array;
import java.util.*;


public class TicTacToeBasic {

    static TreeMap<String, String> playOptions;
    static Scanner input = new Scanner(System.in);
    static String playMode;
    static Random randomIndex = new Random();

    public static void main(String[] args) {

        initGame();

        for (int turn = 1; turn < 10; ) {

            playerTurn();
            displayBoard();
            if (isWin()) break;
            turn++;

            if (isDraw(turn)) break;

            computerTurn();
            displayBoard();
            if (isWin()) break;
            turn++;

        }
    }

    /**
     *
     */
    static void initGame() {
        playOptions = new TreeMap<>() {{
            put("A1", "  ");
            put("A2", "  ");
            put("A3", "  ");
            put("B1", "  ");
            put("B2", "  ");
            put("B3", "  ");
            put("C1", "  ");
            put("C2", "  ");
            put("C3", "  ");
        }};

        System.out.println("Welcome to Tic-Tac-Toe");
        displayBoardStartGame();
        ChoosePlayMode();
        displayBoard();
    }

    /**
     * Let player choose one of two play modes
     * A: will show all the made moves and all the remaining options during the game
     * B: will only show all the made moves during the game
     * The selected value will be stored in the variable PlayMode
     */
    static void ChoosePlayMode() {
        System.out.println();
        System.out.println("Game has two play modes\n" +
                "A:                 B:\n" +
                " A1 | XX | C1          | XX |    \n" +
                "--------------     --------------\n" +
                " A2 | B2 | XX          |    | XX \n" +
                "--------------     --------------\n" +
                " OO | B3 | C3       OO |    |      "
        );
        do {
            System.out.print("Please choose playmode A or B:");
            playMode = input.next();
        } while (!(playMode.equals("A") || playMode.equals("B"))); // is: !playMode.equals("A") && !playMode.equals("B")
        System.out.println();
        System.out.println("Game has started - Have Fun");

    }

    /**
     * Player is asked to enter his move
     * Only the remaining options are allowed
     * This will be validated using the isMoveNotValid method
     * The request to enter a move will stop at a valid move selection
     */
    static void playerTurn() {
        String playerMove;
        do {
            System.out.print("Please enter your move:");
            playerMove = input.next();
        } while (isMoveNotValid(playerMove));
        playOptions.put(playerMove, "XX");
    }

    /**
     * Using the computerPickMove method a random move will be picked and displayed
     */
    static void computerTurn() {
        String computerMove = computerPickMove();
        System.out.println("I will play at " + computerMove);
        playOptions.put(computerMove, "OO");
    }

    /**
     * Computer will pick a random move from the remaining options
     *
     * @return the random move
     */
    static String computerPickMove() {
        ArrayList<String> remainingOptions = remainingPlayOptions();
        return remainingOptions.get(randomIndex.nextInt(remainingOptions.size()));
    }

    /**
     * The board with all the options will be displayed at the start of the game
     */
    static void displayBoardStartGame() {
        System.out.println("" +
                " A1 | B1 | C1 \n" +
                "--------------\n" +
                " A2 | B2 | C2 \n" +
                "--------------\n" +
                " A3 | B3 | C3   "
        );
        System.out.println();
    }

    /**
     * The board will be displayed according to the play mode chosen
     * A: will show all the made moves and all the remaining options
     * B: will only show all the made moves
     */
    static void displayBoard() {
        String first;
        String second;
        String third;
        System.out.println();
        // Board will be printed layer by layer beginning from the top
        for (int i = 1; i <= 3; i++) {
            if (playMode.equals("A")) {
                first = playOptions.get("A" + i).equals("  ") ? ("A" + i) : playOptions.get("A" + i);
                second = playOptions.get("B" + i).equals("  ") ? ("B" + i) : playOptions.get("B" + i);
                third = playOptions.get("C" + i).equals("  ") ? ("C" + i) : playOptions.get("C" + i);
            } else {
                first = playOptions.get("A" + i);
                second = playOptions.get("B" + i);
                third = playOptions.get("C" + i);
            }

            System.out.printf(" %s | %s | %s \n", first, second, third);
            if (i != 3) {
                System.out.println("--------------");
            }
        }
        System.out.println();
    }

    /**
     * Validate the player's input (move)
     * A move is valid if it's one of the remaining options
     *
     * @param move is the player's input
     * @return true if move is not valid and false is valid
     */
    static boolean isMoveNotValid(String move) {
        ArrayList<String> remainingOptions = remainingPlayOptions();
        if (!remainingOptions.contains(move)) {
            System.out.println("This is an invalid move!");
            return true;
        } else {
            return false;
        }
    }

    /**
     * The options (moves) that are still available to be played
     *
     * @return arraylist of the remaining options
     */
    static ArrayList<String> remainingPlayOptions() {
        ArrayList<String> remainingOptions = new ArrayList<>();
        playOptions.forEach((key, value) -> {
                    if (value.equals("  ")) remainingOptions.add(key);
                }
        );
        return remainingOptions;
    }

    /**
     * The game consists out of 9 turns that can result in a win
     * If turn 10 reached this means none of the players won
     *
     * @param turn count
     * @return true if turn 10 is reached and it's a draw and false if not yet
     */
    static boolean isDraw(int turn) {
        if (turn == 10) {
            System.out.println("It’s a draw!");
            return true;
        } else {
            return false;
        }
    }

    /**
     * Check if player or computer won by having 3 of their marks in a line
     * Win options: 3 horizontal lines - 3 vertical lines - 2 diagonal lines
     *
     * @return true if there is a winner and false if no winner yet
     */
    static boolean isWin() {
        String line = "";
        for (int winOption = 1; winOption <= 8; winOption++) {

            switch (winOption) {
                case 1:
                    line = playOptions.get("A1") + playOptions.get("A2") + playOptions.get("A3");
                    break;
                case 2:
                    line = playOptions.get("B1") + playOptions.get("B2") + playOptions.get("B3");
                    break;
                case 3:
                    line = playOptions.get("C1") + playOptions.get("C2") + playOptions.get("C3");
                    break;
                case 4:
                    line = playOptions.get("A1") + playOptions.get("B1") + playOptions.get("C1");
                    break;
                case 5:
                    line = playOptions.get("A2") + playOptions.get("B2") + playOptions.get("C2");
                    break;
                case 6:
                    line = playOptions.get("A3") + playOptions.get("B3") + playOptions.get("C3");
                    break;
                case 7:
                    line = playOptions.get("A1") + playOptions.get("B2") + playOptions.get("C3");
                    break;
                case 8:
                    line = playOptions.get("A3") + playOptions.get("B2") + playOptions.get("C1");
                    break;
            }
            if (line.equals("XXXXXX")) {
                System.out.println("You beat me!");
                return true;
            } else if (line.equals("OOOOOO")) {
                System.out.println("I beat you!");
                return true;
            }
        }
        return false;
    }

}



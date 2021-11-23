import java.sql.Array;
import java.util.*;


public class TicTacToeBasic {

    static TreeMap<String, String> playOptions;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

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
        displayBoard();

        for (int turn = 0; turn <= 9; ) {

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

    static void playerTurn() {
        String playerMove;
        do {
            System.out.print("Please enter your move:");
            playerMove = input.next();
        } while (isMoveNotValid(playerMove));
        playOptions.put(playerMove, "XX");
    }

    static void computerTurn() {
        String computerMove = computerPickMove();
        System.out.println("I will play at " + computerMove);
        playOptions.put(computerMove, "OO");
    }

    static String computerPickMove() {
        ArrayList<String> remainingOptions = remainingPlayOptions();
        Random randomIndex = new Random();
        return remainingOptions.get(randomIndex.nextInt(remainingOptions.size()));
    }

    static void displayBoard() {
        System.out.println();
        for (int i = 1; i <= 3; i++) {
            String first = playOptions.get("A" + i).equals("  ") ? ("A" + i) : playOptions.get("A" + i);
            String second = playOptions.get("B" + i).equals("  ") ? ("B" + i) : playOptions.get("B" + i);
            String third = playOptions.get("C" + i).equals("  ") ? ("C" + i) : playOptions.get("C" + i);
            System.out.printf(" %s | %s | %s \n", first, second, third);
            if (i != 3) {
                System.out.println("--------------");
            }
        }
        System.out.println();
    }

    static boolean isMoveNotValid(String move) {
        ArrayList<String> remainingOptions = remainingPlayOptions();
        if (!remainingOptions.contains(move)) {
            System.out.println("This is an invalid move!");
            return true;
        } else {
            return false;
        }
    }

    static ArrayList<String> remainingPlayOptions() {
        ArrayList<String> remainingOptions = new ArrayList<>();
        playOptions.forEach((key, value) -> {
                    if (value.equals("  ")) remainingOptions.add(key);
                }
        );
        return remainingOptions;
    }

    static boolean isDraw(int turn) {
        if (turn == 9) {
            System.out.println("It’s a draw!");
            return true;
        } else {
            return false;
        }
    }

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


